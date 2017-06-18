package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopProductMapper;
import com.zheng.shop.dao.model.ShopProduct;
import com.zheng.shop.dao.model.ShopProductExample;
import com.zheng.shop.rpc.api.ShopProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopProductService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopProductServiceImpl extends BaseServiceImpl<ShopProductMapper, ShopProduct, ShopProductExample> implements ShopProductService {

    private static Logger _log = LoggerFactory.getLogger(ShopProductServiceImpl.class);

    @Autowired
    ShopProductMapper shopProductMapper;

}