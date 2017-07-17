package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseService;
import com.zheng.shop.dao.model.ShopProductCategory;
import com.zheng.shop.dao.model.ShopProductCategoryExample;

import java.util.List;

/**
* ShopProductCategoryService接口
* Created by shuzheng on 2017/6/17.
*/
public interface ShopProductCategoryService extends BaseService<ShopProductCategory, ShopProductCategoryExample> {

    ShopProductCategory getParent(String parentId);

    List<ShopProductCategory> getChildren(String id);

    List<ShopProductCategory> recursivProductCategoryTreeList(List<ShopProductCategory> allProductCategoryList, ShopProductCategory p, List<ShopProductCategory> temp);

}