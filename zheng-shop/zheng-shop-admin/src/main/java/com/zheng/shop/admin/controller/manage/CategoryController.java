package com.zheng.shop.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.zheng.common.util.CommonUtil;
import com.zheng.shop.common.constant.ShopConstant;
import com.zheng.shop.common.constant.ShopResult;
import com.zheng.shop.common.constant.ShopResultConstant;
import com.zheng.shop.dao.model.ShopProductCategory;
import com.zheng.shop.dao.model.ShopProductCategoryExample;
import com.zheng.shop.rpc.api.ShopProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品管理
 * Created by madao on 2017/7/2.
 */
@Controller
@Api(value = "商品管理", description = "商品管理")
@RequestMapping("/manage/category")
public class CategoryController {

    @Autowired
    private ShopProductCategoryService shopProductCategoryService;

    @ApiOperation(value = "类目列表")
    @RequiresPermissions("shop:category:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/manage/category/index.jsp";
    }


    @ApiOperation(value = "类目列表")
    @RequiresPermissions("shop:category:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ShopProductCategoryExample shopProductCategoryExample = new ShopProductCategoryExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            if ("orderList".equals(sort)){
                sort = "order_list";
            }
            shopProductCategoryExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            shopProductCategoryExample.or().andNameLike("%" + search + "%");
        }
        List<ShopProductCategory> rows = shopProductCategoryService
                .selectByExampleWithBLOBsForOffsetPage(shopProductCategoryExample,offset,limit);
        long total = shopProductCategoryService.countByExample(shopProductCategoryExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增类目")
    @RequiresPermissions("shop:category:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(ModelMap modelMap) {
        ShopProductCategoryExample shopProductCategoryExample = new ShopProductCategoryExample();
        List<ShopProductCategory> shopProductCategories = shopProductCategoryService.selectByExampleWithBLOBs(shopProductCategoryExample);
        shopProductCategories = shopProductCategoryService.recursivProductCategoryTreeList(shopProductCategories,null,null);
        modelMap.put("productCategories",shopProductCategories);
        return "/manage/category/create.jsp";
    }

    @ApiOperation(value = "新增类目")
    @RequiresPermissions("shop:category:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(ShopProductCategory shopProductCategory) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopProductCategory.setCtime(time);
        shopProductCategory.setId(CommonUtil.getUUID());
        boolean isTop = "-1".equals(shopProductCategory.getParentId());
        if (isTop) shopProductCategory.setParentId(null);
        int count = shopProductCategoryService.insertSelective(shopProductCategory);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        ShopProductCategoryExample mExample = new ShopProductCategoryExample();
        mExample.createCriteria().andIdEqualTo(shopProductCategory.getId());
        if (isTop){
            shopProductCategory.setPath(shopProductCategory.getId());
            count = shopProductCategoryService.updateByExampleWithBLOBs(shopProductCategory,mExample);
        }else{
            ShopProductCategoryExample pExample = new ShopProductCategoryExample();
            pExample.createCriteria().andIdEqualTo(shopProductCategory.getParentId());
            ShopProductCategory parent = shopProductCategoryService.selectFirstByExampleWithBLOBs(pExample);
            String pPath = parent.getPath();
            shopProductCategory.setPath(pPath +","+ shopProductCategory.getId());
            count = shopProductCategoryService.updateByExampleWithBLOBs(shopProductCategory,mExample);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "编辑类目")
    @RequiresPermissions("shop:category:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id,ModelMap modelMap) {
        // 查询所有类目（作为父类目）
        ShopProductCategoryExample shopProductCategoryExample = new ShopProductCategoryExample();
        List<ShopProductCategory> shopProductCategories = shopProductCategoryService.selectByExampleWithBLOBs(shopProductCategoryExample);
        shopProductCategories = shopProductCategoryService.recursivProductCategoryTreeList(shopProductCategories,null,null);
        
        // 查询当前类目
        ShopProductCategoryExample shopProductCategoryExample2 = new ShopProductCategoryExample();
        shopProductCategoryExample2.createCriteria().andIdEqualTo(id);
        ShopProductCategory shopProductCategory = shopProductCategoryService.selectFirstByExampleWithBLOBs(shopProductCategoryExample2);
        
        modelMap.put("productCategories",shopProductCategories);
        modelMap.put("shopProductCategory",shopProductCategory);
        return "/manage/category/update.jsp";
    }

    @ApiOperation(value = "编辑类目")
    @RequiresPermissions("shop:category:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") String id,ShopProductCategory shopProductCategory) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopProductCategory.setId(id);
        shopProductCategory.setMtime(time);
        int count = shopProductCategoryService.updateByPrimaryKeySelective(shopProductCategory);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }
    
    @ApiOperation(value = "删除类目")
    @RequiresPermissions("shop:category:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        String[] cids = ids.split(ShopConstant.ID_SEPARATOR);
        String fail_message = "";
        int count = 0;
        for (String cid : cids) {
            List<ShopProductCategory> children = shopProductCategoryService.getChildren(cid);
            ShopProductCategoryExample shopProductCategoryExample = new ShopProductCategoryExample();
            shopProductCategoryExample.createCriteria().andIdEqualTo(cid);
            if(children != null && children.size() > 0){
                ShopProductCategory shopProductCategory = shopProductCategoryService.selectFirstByExample(shopProductCategoryExample);
                fail_message += shopProductCategory.getName() + " ";
            }else{
                count += shopProductCategoryService.deleteByExample(shopProductCategoryExample);
            }
        }
        if (fail_message.length() > 0){
            return new ShopResult(ShopResultConstant.DELETE_HAS_CHILDREN,fail_message);
        }else{
            return new ShopResult(ShopResultConstant.SUCCESS, count);
        }
    }

}
