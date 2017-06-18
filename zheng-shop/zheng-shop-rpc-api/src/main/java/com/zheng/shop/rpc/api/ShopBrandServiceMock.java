package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopBrandMapper;
import com.zheng.shop.dao.model.ShopBrand;
import com.zheng.shop.dao.model.ShopBrandExample;

/**
* 降级实现ShopBrandService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopBrandServiceMock extends BaseServiceMock<ShopBrandMapper, ShopBrand, ShopBrandExample> implements ShopBrandService {

}
