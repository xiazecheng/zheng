package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopProductAttributeMapStore;
import com.zheng.shop.dao.model.ShopProductAttributeMapStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopProductAttributeMapStoreMapper {
    long countByExample(ShopProductAttributeMapStoreExample example);

    int deleteByExample(ShopProductAttributeMapStoreExample example);

    int deleteByPrimaryKey(@Param("productId") String productId, @Param("mapkeyId") String mapkeyId);

    int insert(ShopProductAttributeMapStore record);

    int insertSelective(ShopProductAttributeMapStore record);

    List<ShopProductAttributeMapStore> selectByExample(ShopProductAttributeMapStoreExample example);

    ShopProductAttributeMapStore selectByPrimaryKey(@Param("productId") String productId, @Param("mapkeyId") String mapkeyId);

    int updateByExampleSelective(@Param("record") ShopProductAttributeMapStore record, @Param("example") ShopProductAttributeMapStoreExample example);

    int updateByExample(@Param("record") ShopProductAttributeMapStore record, @Param("example") ShopProductAttributeMapStoreExample example);

    int updateByPrimaryKeySelective(ShopProductAttributeMapStore record);

    int updateByPrimaryKey(ShopProductAttributeMapStore record);
}