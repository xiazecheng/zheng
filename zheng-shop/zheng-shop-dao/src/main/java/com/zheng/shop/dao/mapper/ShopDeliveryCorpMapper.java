package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopDeliveryCorp;
import com.zheng.shop.dao.model.ShopDeliveryCorpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopDeliveryCorpMapper {
    long countByExample(ShopDeliveryCorpExample example);

    int deleteByExample(ShopDeliveryCorpExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopDeliveryCorp record);

    int insertSelective(ShopDeliveryCorp record);

    List<ShopDeliveryCorp> selectByExample(ShopDeliveryCorpExample example);

    ShopDeliveryCorp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopDeliveryCorp record, @Param("example") ShopDeliveryCorpExample example);

    int updateByExample(@Param("record") ShopDeliveryCorp record, @Param("example") ShopDeliveryCorpExample example);

    int updateByPrimaryKeySelective(ShopDeliveryCorp record);

    int updateByPrimaryKey(ShopDeliveryCorp record);
}