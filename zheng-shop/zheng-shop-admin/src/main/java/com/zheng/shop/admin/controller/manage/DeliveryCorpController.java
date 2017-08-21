package com.zheng.shop.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.zheng.common.util.CommonUtil;
import com.zheng.shop.common.constant.ShopConstant;
import com.zheng.shop.common.constant.ShopResult;
import com.zheng.shop.common.constant.ShopResultConstant;
import com.zheng.shop.dao.model.ShopDeliveryCorp;
import com.zheng.shop.dao.model.ShopDeliveryCorpExample;
import com.zheng.shop.rpc.api.ShopDeliveryCorpService;
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
@Api(value = "物流公司管理", description = "物流公司管理")
@RequestMapping("/manage/deliverycorp")
public class DeliveryCorpController {

    @Autowired
    private ShopDeliveryCorpService shopDeliveryCorpService;

    @ApiOperation(value = "物流公司列表")
    @RequiresPermissions("shop:deliverycorp:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/manage/deliverycorp/index.jsp";
    }

    @ApiOperation(value = "物流公司列表")
    @RequiresPermissions("shop:deliverycorp:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ShopDeliveryCorpExample shopProductCategoryExample = new ShopDeliveryCorpExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            if ("orderList".equals(sort)){
                sort = "order_list";
            }
            shopProductCategoryExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            shopProductCategoryExample.or().andNameLike("%" + search + "%");
        }
        List<ShopDeliveryCorp> rows = shopDeliveryCorpService
                .selectByExampleForOffsetPage(shopProductCategoryExample,offset,limit);
        long total = shopDeliveryCorpService.countByExample(shopProductCategoryExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增物流公司")
    @RequiresPermissions("shop:deliverycorp:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "/manage/deliverycorp/create.jsp";
    }

    @ApiOperation(value = "新增物流公司")
    @RequiresPermissions("shop:deliverycorp:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(ShopDeliveryCorp shopDeliveryCorp) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopDeliveryCorp.setCtime(time);
        shopDeliveryCorp.setId(CommonUtil.getUUID());
        int count = shopDeliveryCorpService.insert(shopDeliveryCorp);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "修改物流公司")
    @RequiresPermissions("shop:deliverycorp:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id, ModelMap modelMap) {
        ShopDeliveryCorpExample shopDeliveryCorpExample = new ShopDeliveryCorpExample();
        shopDeliveryCorpExample.createCriteria().andIdEqualTo(id);
        ShopDeliveryCorp shopDeliveryCorp = shopDeliveryCorpService.selectFirstByExample(shopDeliveryCorpExample);
        modelMap.put("shopDeliveryCorp",shopDeliveryCorp);
        return "/manage/deliverycorp/update.jsp";
    }

    @ApiOperation(value = "修改物流公司")
    @RequiresPermissions("shop:deliverycorp:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") String id, ShopDeliveryCorp shopDeliveryCorp) {
        ComplexResult result = FluentValidator.checkAll()
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new ShopResult(ShopResultConstant.FAILED, result.getErrors());
        }
        long time = System.currentTimeMillis();
        shopDeliveryCorp.setId(id);
        shopDeliveryCorp.setMtime(time);
        int count = shopDeliveryCorpService.updateByPrimaryKeySelective(shopDeliveryCorp);
        if (count < 0) {
            return new ShopResult(ShopResultConstant.FAILED, ShopConstant.UN_HANDLE_EXCEPTION);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "删除物流公司")
    @RequiresPermissions("shop:deliverycorp:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        String[] dids = ids.split(ShopConstant.ID_SEPARATOR);
        int count = 0;
        for (String id:dids) {
            ShopDeliveryCorpExample shopDeliveryCorpExample = new ShopDeliveryCorpExample();
            shopDeliveryCorpExample.createCriteria().andIdEqualTo(id);
            count += shopDeliveryCorpService.deleteByExample(shopDeliveryCorpExample);
        }
        return new ShopResult(ShopResultConstant.SUCCESS, count);
    }
    
}
