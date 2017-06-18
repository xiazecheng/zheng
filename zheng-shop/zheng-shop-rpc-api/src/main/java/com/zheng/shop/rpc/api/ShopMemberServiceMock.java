package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopMemberMapper;
import com.zheng.shop.dao.model.ShopMember;
import com.zheng.shop.dao.model.ShopMemberExample;

/**
* 降级实现ShopMemberService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopMemberServiceMock extends BaseServiceMock<ShopMemberMapper, ShopMember, ShopMemberExample> implements ShopMemberService {

}
