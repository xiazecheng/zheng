package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopProductMapper;
import com.zheng.shop.dao.model.ShopProduct;
import com.zheng.shop.dao.model.ShopProductExample;

/**
* 降级实现ShopProductService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopProductServiceMock extends BaseServiceMock<ShopProductMapper, ShopProduct, ShopProductExample> implements ShopProductService {

}
