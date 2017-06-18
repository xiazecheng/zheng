package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopProductAttributeMapper;
import com.zheng.shop.dao.model.ShopProductAttribute;
import com.zheng.shop.dao.model.ShopProductAttributeExample;

/**
* 降级实现ShopProductAttributeService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopProductAttributeServiceMock extends BaseServiceMock<ShopProductAttributeMapper, ShopProductAttribute, ShopProductAttributeExample> implements ShopProductAttributeService {

}
