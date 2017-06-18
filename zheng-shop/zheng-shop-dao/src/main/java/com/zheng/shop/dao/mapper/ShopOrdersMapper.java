package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopOrders;
import com.zheng.shop.dao.model.ShopOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopOrdersMapper {
    long countByExample(ShopOrdersExample example);

    int deleteByExample(ShopOrdersExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopOrders record);

    int insertSelective(ShopOrders record);

    List<ShopOrders> selectByExampleWithBLOBs(ShopOrdersExample example);

    List<ShopOrders> selectByExample(ShopOrdersExample example);

    ShopOrders selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopOrders record, @Param("example") ShopOrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopOrders record, @Param("example") ShopOrdersExample example);

    int updateByExample(@Param("record") ShopOrders record, @Param("example") ShopOrdersExample example);

    int updateByPrimaryKeySelective(ShopOrders record);

    int updateByPrimaryKeyWithBLOBs(ShopOrders record);

    int updateByPrimaryKey(ShopOrders record);
}