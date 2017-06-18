package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopStore;
import com.zheng.shop.dao.model.ShopStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopStoreMapper {
    long countByExample(ShopStoreExample example);

    int deleteByExample(ShopStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopStore record);

    int insertSelective(ShopStore record);

    List<ShopStore> selectByExample(ShopStoreExample example);

    ShopStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopStore record, @Param("example") ShopStoreExample example);

    int updateByExample(@Param("record") ShopStore record, @Param("example") ShopStoreExample example);

    int updateByPrimaryKeySelective(ShopStore record);

    int updateByPrimaryKey(ShopStore record);
}