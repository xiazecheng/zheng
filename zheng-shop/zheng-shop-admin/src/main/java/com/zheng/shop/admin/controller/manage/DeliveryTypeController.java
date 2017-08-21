package com.zheng.shop.admin.controller.manage;

import com.zheng.shop.rpc.api.ShopDeliveryTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by madao on 2017/7/18.
 */
@Controller
@Api(value = "配送方式管理", description = "配送方式管理")
@RequestMapping("/manage/deliverytype")
public class DeliveryTypeController {

    @Autowired
    private ShopDeliveryTypeService shopDeliveryTypeService;

    @ApiOperation(value = "配送方式列表")
    @RequiresPermissions("shop:deliverytype:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/manage/deliverytype/index.jsp";
    }
}
