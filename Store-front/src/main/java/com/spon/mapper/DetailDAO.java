package com.spon.mapper;

import com.spon.domain.Detail;
import com.spon.domain.DetailExample;
import java.util.List;

public interface DetailDAO {
    int countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Detail record);

    void insertSelective(Detail record);

    List<Detail> selectByExample(DetailExample example);

    Detail selectByPrimaryKey(Long id);

    int updateByExampleSelective(Detail record, DetailExample example);

    int updateByExample(Detail record, DetailExample example);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}