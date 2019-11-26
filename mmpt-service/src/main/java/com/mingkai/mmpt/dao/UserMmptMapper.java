package com.mingkai.mmpt.dao;

import com.mingkai.mmpt.model.UserMmpt;
import com.mingkai.mmpt.model.UserMmptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMmptMapper {
    long countByExample(UserMmptExample example);

    int deleteByExample(UserMmptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserMmpt record);

    int insertSelective(UserMmpt record);

    List<UserMmpt> selectByExample(UserMmptExample example);

    UserMmpt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserMmpt record, @Param("example") UserMmptExample example);

    int updateByExample(@Param("record") UserMmpt record, @Param("example") UserMmptExample example);

    int updateByPrimaryKeySelective(UserMmpt record);

    int updateByPrimaryKey(UserMmpt record);
}