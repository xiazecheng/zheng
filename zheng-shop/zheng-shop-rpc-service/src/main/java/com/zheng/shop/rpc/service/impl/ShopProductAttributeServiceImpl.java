package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopProductAttributeMapper;
import com.zheng.shop.dao.model.ShopProductAttribute;
import com.zheng.shop.dao.model.ShopProductAttributeExample;
import com.zheng.shop.rpc.api.ShopProductAttributeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopProductAttributeService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopProductAttributeServiceImpl extends BaseServiceImpl<ShopProductAttributeMapper, ShopProductAttribute, ShopProductAttributeExample> implements ShopProductAttributeService {

    private static Logger _log = LoggerFactory.getLogger(ShopProductAttributeServiceImpl.class);

    @Autowired
    ShopProductAttributeMapper shopProductAttributeMapper;

}