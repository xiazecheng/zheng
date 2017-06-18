package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopMemberRank;
import com.zheng.shop.dao.model.ShopMemberRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMemberRankMapper {
    long countByExample(ShopMemberRankExample example);

    int deleteByExample(ShopMemberRankExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopMemberRank record);

    int insertSelective(ShopMemberRank record);

    List<ShopMemberRank> selectByExample(ShopMemberRankExample example);

    ShopMemberRank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopMemberRank record, @Param("example") ShopMemberRankExample example);

    int updateByExample(@Param("record") ShopMemberRank record, @Param("example") ShopMemberRankExample example);

    int updateByPrimaryKeySelective(ShopMemberRank record);

    int updateByPrimaryKey(ShopMemberRank record);
}