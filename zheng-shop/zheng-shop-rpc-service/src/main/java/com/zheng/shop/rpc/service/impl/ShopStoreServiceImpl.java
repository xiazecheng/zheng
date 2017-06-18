package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopStoreMapper;
import com.zheng.shop.dao.model.ShopStore;
import com.zheng.shop.dao.model.ShopStoreExample;
import com.zheng.shop.rpc.api.ShopStoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopStoreService实现
* Created by shuzheng on 2017/6/18.
*/
@Service
@Transactional
@BaseService
public class ShopStoreServiceImpl extends BaseServiceImpl<ShopStoreMapper, ShopStore, ShopStoreExample> implements ShopStoreService {

    private static Logger _log = LoggerFactory.getLogger(ShopStoreServiceImpl.class);

    @Autowired
    ShopStoreMapper shopStoreMapper;

}