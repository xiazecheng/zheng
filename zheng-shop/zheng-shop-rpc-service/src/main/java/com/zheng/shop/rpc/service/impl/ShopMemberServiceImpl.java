package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopMemberMapper;
import com.zheng.shop.dao.model.ShopMember;
import com.zheng.shop.dao.model.ShopMemberExample;
import com.zheng.shop.rpc.api.ShopMemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopMemberService实现
* Created by shuzheng on 2017/6/17.
*/
@Service
@Transactional
@BaseService
public class ShopMemberServiceImpl extends BaseServiceImpl<ShopMemberMapper, ShopMember, ShopMemberExample> implements ShopMemberService {

    private static Logger _log = LoggerFactory.getLogger(ShopMemberServiceImpl.class);

    @Autowired
    ShopMemberMapper shopMemberMapper;

}