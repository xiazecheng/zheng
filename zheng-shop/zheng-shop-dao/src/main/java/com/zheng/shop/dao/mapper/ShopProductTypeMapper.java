package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopProductType;
import com.zheng.shop.dao.model.ShopProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopProductTypeMapper {
    long countByExample(ShopProductTypeExample example);

    int deleteByExample(ShopProductTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopProductType record);

    int insertSelective(ShopProductType record);

    List<ShopProductType> selectByExample(ShopProductTypeExample example);

    ShopProductType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopProductType record, @Param("example") ShopProductTypeExample example);

    int updateByExample(@Param("record") ShopProductType record, @Param("example") ShopProductTypeExample example);

    int updateByPrimaryKeySelective(ShopProductType record);

    int updateByPrimaryKey(ShopProductType record);
}