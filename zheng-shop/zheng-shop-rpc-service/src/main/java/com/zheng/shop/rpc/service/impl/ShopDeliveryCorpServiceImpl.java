package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopDeliveryCorpMapper;
import com.zheng.shop.dao.model.ShopDeliveryCorp;
import com.zheng.shop.dao.model.ShopDeliveryCorpExample;
import com.zheng.shop.rpc.api.ShopDeliveryCorpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopDeliveryCorpService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopDeliveryCorpServiceImpl extends BaseServiceImpl<ShopDeliveryCorpMapper, ShopDeliveryCorp, ShopDeliveryCorpExample> implements ShopDeliveryCorpService {

    private static Logger _log = LoggerFactory.getLogger(ShopDeliveryCorpServiceImpl.class);

    @Autowired
    ShopDeliveryCorpMapper shopDeliveryCorpMapper;

}