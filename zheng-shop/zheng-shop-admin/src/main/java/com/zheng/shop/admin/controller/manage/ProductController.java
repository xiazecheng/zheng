package com.zheng.shop.admin.controller.manage;

import com.zheng.shop.rpc.api.ShopProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 商品Controller
 * Created by madao on 2017/7/2.
 */
@Controller
@Api(value = "商品管理", description = "商品管理")
@RequestMapping("/manage/product")
public class ProductController {
    private static Logger _log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ShopProductService shopProductService;

    @ApiOperation(value = "商品列表")
    @RequiresPermissions("shop:product:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/product/index.jsp";
    }
}
