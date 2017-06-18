package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopProductCategoryMapper;
import com.zheng.shop.dao.model.ShopProductCategory;
import com.zheng.shop.dao.model.ShopProductCategoryExample;
import com.zheng.shop.rpc.api.ShopProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopProductCategoryService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopProductCategoryServiceImpl extends BaseServiceImpl<ShopProductCategoryMapper, ShopProductCategory, ShopProductCategoryExample> implements ShopProductCategoryService {

    private static Logger _log = LoggerFactory.getLogger(ShopProductCategoryServiceImpl.class);

    @Autowired
    ShopProductCategoryMapper shopProductCategoryMapper;

}