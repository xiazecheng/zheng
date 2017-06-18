package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopProductCategory;
import com.zheng.shop.dao.model.ShopProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopProductCategoryMapper {
    long countByExample(ShopProductCategoryExample example);

    int deleteByExample(ShopProductCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopProductCategory record);

    int insertSelective(ShopProductCategory record);

    List<ShopProductCategory> selectByExampleWithBLOBs(ShopProductCategoryExample example);

    List<ShopProductCategory> selectByExample(ShopProductCategoryExample example);

    ShopProductCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopProductCategory record, @Param("example") ShopProductCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopProductCategory record, @Param("example") ShopProductCategoryExample example);

    int updateByExample(@Param("record") ShopProductCategory record, @Param("example") ShopProductCategoryExample example);

    int updateByPrimaryKeySelective(ShopProductCategory record);

    int updateByPrimaryKeyWithBLOBs(ShopProductCategory record);

    int updateByPrimaryKey(ShopProductCategory record);
}