package com.spon.mapper;

import com.spon.domain.Brand;
import com.spon.domain.BrandExample;
import java.util.List;

public interface BrandDAO {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Brand record);

    void insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Long id);

    int updateByExampleSelective(Brand record, BrandExample example);

    int updateByExample(Brand record, BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}