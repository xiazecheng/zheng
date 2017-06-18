package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopOrdersMapper;
import com.zheng.shop.dao.model.ShopOrders;
import com.zheng.shop.dao.model.ShopOrdersExample;
import com.zheng.shop.rpc.api.ShopOrdersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopOrdersService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopOrdersServiceImpl extends BaseServiceImpl<ShopOrdersMapper, ShopOrders, ShopOrdersExample> implements ShopOrdersService {

    private static Logger _log = LoggerFactory.getLogger(ShopOrdersServiceImpl.class);

    @Autowired
    ShopOrdersMapper shopOrdersMapper;

}