package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopDeliveryType;
import com.zheng.shop.dao.model.ShopDeliveryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopDeliveryTypeMapper {
    long countByExample(ShopDeliveryTypeExample example);

    int deleteByExample(ShopDeliveryTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopDeliveryType record);

    int insertSelective(ShopDeliveryType record);

    List<ShopDeliveryType> selectByExampleWithBLOBs(ShopDeliveryTypeExample example);

    List<ShopDeliveryType> selectByExample(ShopDeliveryTypeExample example);

    ShopDeliveryType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopDeliveryType record, @Param("example") ShopDeliveryTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopDeliveryType record, @Param("example") ShopDeliveryTypeExample example);

    int updateByExample(@Param("record") ShopDeliveryType record, @Param("example") ShopDeliveryTypeExample example);

    int updateByPrimaryKeySelective(ShopDeliveryType record);

    int updateByPrimaryKeyWithBLOBs(ShopDeliveryType record);

    int updateByPrimaryKey(ShopDeliveryType record);
}