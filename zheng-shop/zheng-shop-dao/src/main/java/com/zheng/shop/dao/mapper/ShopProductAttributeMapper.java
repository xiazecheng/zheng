package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopProductAttribute;
import com.zheng.shop.dao.model.ShopProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopProductAttributeMapper {
    long countByExample(ShopProductAttributeExample example);

    int deleteByExample(ShopProductAttributeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopProductAttribute record);

    int insertSelective(ShopProductAttribute record);

    List<ShopProductAttribute> selectByExample(ShopProductAttributeExample example);

    ShopProductAttribute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopProductAttribute record, @Param("example") ShopProductAttributeExample example);

    int updateByExample(@Param("record") ShopProductAttribute record, @Param("example") ShopProductAttributeExample example);

    int updateByPrimaryKeySelective(ShopProductAttribute record);

    int updateByPrimaryKey(ShopProductAttribute record);
}