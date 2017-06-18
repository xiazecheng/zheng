package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopMember;
import com.zheng.shop.dao.model.ShopMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMemberMapper {
    long countByExample(ShopMemberExample example);

    int deleteByExample(ShopMemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopMember record);

    int insertSelective(ShopMember record);

    List<ShopMember> selectByExample(ShopMemberExample example);

    ShopMember selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopMember record, @Param("example") ShopMemberExample example);

    int updateByExample(@Param("record") ShopMember record, @Param("example") ShopMemberExample example);

    int updateByPrimaryKeySelective(ShopMember record);

    int updateByPrimaryKey(ShopMember record);
}