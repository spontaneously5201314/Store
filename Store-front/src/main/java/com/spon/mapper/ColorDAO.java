package com.spon.mapper;

import com.spon.domain.Color;
import com.spon.domain.ColorExample;
import java.util.List;

public interface ColorDAO {
    int countByExample(ColorExample example);

    int deleteByExample(ColorExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Color record);

    void insertSelective(Color record);

    List<Color> selectByExample(ColorExample example);

    Color selectByPrimaryKey(Long id);

    int updateByExampleSelective(Color record, ColorExample example);

    int updateByExample(Color record, ColorExample example);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}