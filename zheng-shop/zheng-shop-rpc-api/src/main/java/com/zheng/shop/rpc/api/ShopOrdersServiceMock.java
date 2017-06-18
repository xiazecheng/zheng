package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopOrdersMapper;
import com.zheng.shop.dao.model.ShopOrders;
import com.zheng.shop.dao.model.ShopOrdersExample;

/**
* 降级实现ShopOrdersService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopOrdersServiceMock extends BaseServiceMock<ShopOrdersMapper, ShopOrders, ShopOrdersExample> implements ShopOrdersService {

}
