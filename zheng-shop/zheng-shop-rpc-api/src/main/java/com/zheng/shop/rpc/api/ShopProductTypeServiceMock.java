package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopProductTypeMapper;
import com.zheng.shop.dao.model.ShopProductType;
import com.zheng.shop.dao.model.ShopProductTypeExample;

/**
* 降级实现ShopProductTypeService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopProductTypeServiceMock extends BaseServiceMock<ShopProductTypeMapper, ShopProductType, ShopProductTypeExample> implements ShopProductTypeService {

}
