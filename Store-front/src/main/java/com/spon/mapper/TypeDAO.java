package com.spon.mapper;

import com.spon.domain.Type;
import com.spon.domain.TypeExample;
import java.util.List;

public interface TypeDAO {
    int countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Type record);

    void insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Long id);

    int updateByExampleSelective(Type record, TypeExample example);

    int updateByExample(Type record, TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}