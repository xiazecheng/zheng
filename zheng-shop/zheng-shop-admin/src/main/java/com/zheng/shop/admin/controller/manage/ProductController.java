package com.zheng.shop.admin.controller.manage;

import com.zheng.shop.dao.model.ShopProduct;
import com.zheng.shop.dao.model.ShopProductExample;
import com.zheng.shop.rpc.api.ShopProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ApiOperation(value = "商品列表")
    @RequiresPermissions("shop:product:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ShopProductExample shopProductExample = new ShopProductExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            shopProductExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            shopProductExample.or().andNameLike("%" + search + "%");
        }
        List<ShopProduct> rows = shopProductService
                .selectByExampleForOffsetPage(shopProductExample,offset,limit);
        long total = shopProductService.countByExample(shopProductExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增商品")
    @RequiresPermissions("shop:product:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(ModelMap modelMap) {
        return "/manage/product/create.jsp";
    }

}
