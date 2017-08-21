package com.zheng.shop.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.zheng.common.util.CommonUtil;
import com.zheng.shop.common.constant.ShopConstant;
import com.zheng.shop.common.constant.ShopResult;
import com.zheng.shop.common.constant.ShopResultConstant;
import com.zheng.shop.dao.model.ShopBrand;
import com.zheng.shop.dao.model.ShopBrandExample;
import com.zheng.shop.rpc.api.ShopBrandService;
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
 * Created by madao on 2017/7/19.
 */
@Controller
@Api(value = "商品品牌管理", description = "商品品牌管理")
@RequestMapping("/manage/brand")
public class BrandController {

    @Autowired
    private ShopBrandService shopBrandService;

    @ApiOperation(value = "商品品牌列表")
    @RequiresPermissions("shop:brand:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/manage/brand/index.jsp";
    }

    @ApiOperation(value = "商品品牌列表")
    @RequiresPermissions("shop:brand:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ShopBrandExample shopProductCategoryExample = new ShopBrandExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            if ("orderList".equals(sort)){
                sort = "order_list";
            }
            shopProductCategoryExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            shopProductCategoryExample.or().andNameLike("%" + search + "%");
        }
        List<ShopBrand> rows = shopBrandService
                .selectByExampleForOffsetPage(shopProductCategoryExample,offset,limit);
        long total = shopBrandService.countByExample(shopProductCategoryExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增商品品牌")
    @RequiresPermissions("shop:brand:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "/manage/brand/create.jsp";
    }

    @ApiOperation(value = "新增商品品牌")
    @RequiresPermissions("shop:brand:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(ShopBrand shopBrand) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopBrand.setCtime(time);
        shopBrand.setId(CommonUtil.getUUID());
        int count = shopBrandService.insert(shopBrand);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "修改商品品牌")
    @RequiresPermissions("shop:brand:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id, ModelMap modelMap) {
        ShopBrandExample shopBrandExample = new ShopBrandExample();
        shopBrandExample.createCriteria().andIdEqualTo(id);
        ShopBrand shopBrand = shopBrandService.selectFirstByExampleWithBLOBs(shopBrandExample);
        modelMap.put("shopBrand",shopBrand);
        return "/manage/brand/update.jsp";
    }

    @ApiOperation(value = "修改商品品牌")
    @RequiresPermissions("shop:brand:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") String id, ShopBrand shopBrand) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopBrand.setId(id);
        shopBrand.setMtime(time);
        int count = shopBrandService.updateByPrimaryKeySelective(shopBrand);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "删除商品品牌")
    @RequiresPermissions("shop:brand:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        String[] dids = ids.split(ShopConstant.ID_SEPARATOR);
        int count = 0;
        for (String id:dids) {
            ShopBrandExample shopBrandExample = new ShopBrandExample();
            shopBrandExample.createCriteria().andIdEqualTo(id);
            count += shopBrandService.deleteByExample(shopBrandExample);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }
    
}
