package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopProductTypeMapper;
import com.zheng.shop.dao.model.ShopProductType;
import com.zheng.shop.dao.model.ShopProductTypeExample;
import com.zheng.shop.rpc.api.ShopProductTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopProductTypeService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopProductTypeServiceImpl extends BaseServiceImpl<ShopProductTypeMapper, ShopProductType, ShopProductTypeExample> implements ShopProductTypeService {

    private static Logger _log = LoggerFactory.getLogger(ShopProductTypeServiceImpl.class);

    @Autowired
    ShopProductTypeMapper shopProductTypeMapper;

}