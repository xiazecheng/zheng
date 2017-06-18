package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopStoreMapper;
import com.zheng.shop.dao.model.ShopStore;
import com.zheng.shop.dao.model.ShopStoreExample;

/**
* 降级实现ShopStoreService接口
* Created by shuzheng on 2017/6/18.
*/
public class ShopStoreServiceMock extends BaseServiceMock<ShopStoreMapper, ShopStore, ShopStoreExample> implements ShopStoreService {

}
