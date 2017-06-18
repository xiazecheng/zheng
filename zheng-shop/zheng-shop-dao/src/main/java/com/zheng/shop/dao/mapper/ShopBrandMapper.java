package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopBrand;
import com.zheng.shop.dao.model.ShopBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopBrandMapper {
    long countByExample(ShopBrandExample example);

    int deleteByExample(ShopBrandExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopBrand record);

    int insertSelective(ShopBrand record);

    List<ShopBrand> selectByExampleWithBLOBs(ShopBrandExample example);

    List<ShopBrand> selectByExample(ShopBrandExample example);

    ShopBrand selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopBrand record, @Param("example") ShopBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopBrand record, @Param("example") ShopBrandExample example);

    int updateByExample(@Param("record") ShopBrand record, @Param("example") ShopBrandExample example);

    int updateByPrimaryKeySelective(ShopBrand record);

    int updateByPrimaryKeyWithBLOBs(ShopBrand record);

    int updateByPrimaryKey(ShopBrand record);
}