package com.spon.mapper;

import com.spon.domain.Feature;
import com.spon.domain.FeatureExample;
import java.util.List;

public interface FeatureDAO {
    int countByExample(FeatureExample example);

    int deleteByExample(FeatureExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Feature record);

    void insertSelective(Feature record);

    List<Feature> selectByExample(FeatureExample example);

    Feature selectByPrimaryKey(Long id);

    int updateByExampleSelective(Feature record, FeatureExample example);

    int updateByExample(Feature record, FeatureExample example);

    int updateByPrimaryKeySelective(Feature record);

    int updateByPrimaryKey(Feature record);
}