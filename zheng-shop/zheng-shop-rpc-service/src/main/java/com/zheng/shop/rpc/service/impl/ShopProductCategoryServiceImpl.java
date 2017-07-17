package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopProductCategoryMapper;
import com.zheng.shop.dao.model.ShopProductCategory;
import com.zheng.shop.dao.model.ShopProductCategoryExample;
import com.zheng.shop.rpc.api.ShopProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * ShopProductCategoryService实现
 * Created by shuzheng on 2017/6/17.
 */
@Service
@Transactional
@BaseService
public class ShopProductCategoryServiceImpl extends BaseServiceImpl<ShopProductCategoryMapper, ShopProductCategory, ShopProductCategoryExample> implements ShopProductCategoryService {

    private static Logger _log = LoggerFactory.getLogger(ShopProductCategoryServiceImpl.class);

    @Autowired
    ShopProductCategoryMapper shopProductCategoryMapper;

    @Override
    public ShopProductCategory getParent(String parentId){
        ShopProductCategoryExample example = new ShopProductCategoryExample();
        example.createCriteria().andIdEqualTo(parentId);
        return selectFirstByExampleWithBLOBs(example);
    }

    @Override
    public List<ShopProductCategory> getChildren(String id){
        ShopProductCategoryExample example = new ShopProductCategoryExample();
        example.createCriteria().andParentIdEqualTo(id);
        return selectByExampleWithBLOBs(example);
    }

    // 递归父类排序分类树
    @Override
    public List<ShopProductCategory> recursivProductCategoryTreeList(List<ShopProductCategory> allProductCategoryList, ShopProductCategory p, List<ShopProductCategory> temp) {
        if (temp == null) {
            temp = new ArrayList<ShopProductCategory>();
        }
        for (ShopProductCategory productCategory : allProductCategoryList) {
            ShopProductCategory parent = null;
            if (productCategory.getParentId() != null) parent = getParent(productCategory.getParentId());
            if ((p == null && parent == null) || (productCategory != null && parent == p || (parent != null && parent.equals(p)))) {
                temp.add(productCategory);
                List<ShopProductCategory> children = getChildren(productCategory.getId());
                if (children != null && children.size() > 0) {
                    recursivProductCategoryTreeList(allProductCategoryList, productCategory, temp);
                }
            }
        }
        return temp;
    }



}