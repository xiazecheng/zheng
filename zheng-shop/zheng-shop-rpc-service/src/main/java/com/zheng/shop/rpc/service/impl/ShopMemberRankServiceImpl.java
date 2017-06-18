package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopMemberRankMapper;
import com.zheng.shop.dao.model.ShopMemberRank;
import com.zheng.shop.dao.model.ShopMemberRankExample;
import com.zheng.shop.rpc.api.ShopMemberRankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopMemberRankService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopMemberRankServiceImpl extends BaseServiceImpl<ShopMemberRankMapper, ShopMemberRank, ShopMemberRankExample> implements ShopMemberRankService {

    private static Logger _log = LoggerFactory.getLogger(ShopMemberRankServiceImpl.class);

    @Autowired
    ShopMemberRankMapper shopMemberRankMapper;

}