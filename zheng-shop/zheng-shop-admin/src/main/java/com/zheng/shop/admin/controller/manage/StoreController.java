package com.zheng.shop.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.zheng.shop.common.constant.ShopConstant;
import com.zheng.shop.common.constant.ShopResult;
import com.zheng.shop.common.constant.ShopResultConstant;
import com.zheng.shop.dao.model.ShopStore;
import com.zheng.shop.dao.model.ShopStoreExample;
import com.zheng.shop.rpc.api.ShopStoreService;
import com.zheng.upms.dao.model.UpmsUser;
import com.zheng.upms.rpc.api.UpmsApiService;
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
 * Created by madao on 2017/7/12.
 */
@Controller
@Api(value = "店铺管理", description = "店铺管理")
@RequestMapping("/manage/store")
public class StoreController {

    @Autowired
    private ShopStoreService shopStoreService;

    @Autowired
    private UpmsApiService upmsApiService;


    @ApiOperation(value = "店铺列表")
    @RequiresPermissions("shop:store:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/manage/store/index.jsp";
    }

    @ApiOperation(value = "店铺列表")
    @RequiresPermissions("shop:store:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ShopStoreExample shopStoreExample = new ShopStoreExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            shopStoreExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            shopStoreExample.or().andNameLike("%" + search + "%");
        }
        List<ShopStore> rows = shopStoreService
                .selectByExampleForOffsetPage(shopStoreExample,offset,limit);
        long total = shopStoreService.countByExample(shopStoreExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增店铺")
    @RequiresPermissions("shop:store:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(ModelMap modelMap) {
        List<UpmsUser> upmsUsers = upmsApiService.selectUpmsUserByRole(ShopConstant.STORE_ROLE_NAME);
        System.out.println(upmsUsers.get(0).getRealname());
        modelMap.put("upmsUsers",upmsUsers);
        return "/manage/store/create.jsp";
    }

    @ApiOperation(value = "编辑店铺")
    @RequiresPermissions("shop:store:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") int id,ModelMap modelMap) {
        ShopStore shopStore = shopStoreService.selectByPrimaryKey(id);
        List<UpmsUser> upmsUsers = upmsApiService.selectUpmsUserByRole(ShopConstant.STORE_ROLE_NAME);
        modelMap.put("shopStore",shopStore);
        modelMap.put("upmsUsers",upmsUsers);
        return "/manage/store/update.jsp";
    }

    @ApiOperation(value = "编辑店铺")
    @RequiresPermissions("shop:store:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id,ShopStore shopStore) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopStore.setId(id);
        shopStore.setMtime(time);
        int count = shopStoreService.updateByPrimaryKeySelective(shopStore);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "新增店铺")
    @RequiresPermissions("shop:store:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(ShopStore shopStore) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopStore.setCtime(time);
        int count = shopStoreService.insert(shopStore);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "删除店铺")
    @RequiresPermissions("shop:store:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = shopStoreService.deleteByPrimaryKeys(ids);
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

}
