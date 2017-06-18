package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopProductAttributeMapStoreMapper;
import com.zheng.shop.dao.model.ShopProductAttributeMapStore;
import com.zheng.shop.dao.model.ShopProductAttributeMapStoreExample;
import com.zheng.shop.rpc.api.ShopProductAttributeMapStoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopProductAttributeMapStoreService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopProductAttributeMapStoreServiceImpl extends BaseServiceImpl<ShopProductAttributeMapStoreMapper, ShopProductAttributeMapStore, ShopProductAttributeMapStoreExample> implements ShopProductAttributeMapStoreService {

    private static Logger _log = LoggerFactory.getLogger(ShopProductAttributeMapStoreServiceImpl.class);

    @Autowired
    ShopProductAttributeMapStoreMapper shopProductAttributeMapStoreMapper;

}