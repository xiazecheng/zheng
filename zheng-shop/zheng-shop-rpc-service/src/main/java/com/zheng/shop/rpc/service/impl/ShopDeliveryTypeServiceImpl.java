package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopDeliveryTypeMapper;
import com.zheng.shop.dao.model.ShopDeliveryType;
import com.zheng.shop.dao.model.ShopDeliveryTypeExample;
import com.zheng.shop.rpc.api.ShopDeliveryTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopDeliveryTypeService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopDeliveryTypeServiceImpl extends BaseServiceImpl<ShopDeliveryTypeMapper, ShopDeliveryType, ShopDeliveryTypeExample> implements ShopDeliveryTypeService {

    private static Logger _log = LoggerFactory.getLogger(ShopDeliveryTypeServiceImpl.class);

    @Autowired
    ShopDeliveryTypeMapper shopDeliveryTypeMapper;

}