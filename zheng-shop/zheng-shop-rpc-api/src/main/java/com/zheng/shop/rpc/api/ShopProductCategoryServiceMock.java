package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopProductCategoryMapper;
import com.zheng.shop.dao.model.ShopProductCategory;
import com.zheng.shop.dao.model.ShopProductCategoryExample;

import java.util.List;

/**
* 降级实现ShopProductCategoryService接口
* Created by shuzheng on 2017/6/17.
*/
public class ShopProductCategoryServiceMock extends BaseServiceMock<ShopProductCategoryMapper, ShopProductCategory, ShopProductCategoryExample> implements ShopProductCategoryService {

    @Override
    public ShopProductCategory getParent(String parentId) {
        return null;
    }

    @Override
    public List<ShopProductCategory> getChildren(String id) {
        return null;
    }

    @Override
    public List<ShopProductCategory> recursivProductCategoryTreeList(List<ShopProductCategory> allProductCategoryList, ShopProductCategory p, List<ShopProductCategory> temp) {
        return null;
    }
}
