package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopBrandMapper;
import com.zheng.shop.dao.model.ShopBrand;
import com.zheng.shop.dao.model.ShopBrandExample;
import com.zheng.shop.rpc.api.ShopBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopBrandService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopBrandServiceImpl extends BaseServiceImpl<ShopBrandMapper, ShopBrand, ShopBrandExample> implements ShopBrandService {

    private static Logger _log = LoggerFactory.getLogger(ShopBrandServiceImpl.class);

    @Autowired
    ShopBrandMapper shopBrandMapper;

}