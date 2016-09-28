package com.spon.mapper;

import com.spon.domain.Sku;
import com.spon.domain.SkuExample;
import java.util.List;

public interface SkuDAO {
    int countByExample(SkuExample example);

    int deleteByExample(SkuExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Sku record);

    void insertSelective(Sku record);

    List<Sku> selectByExample(SkuExample example);

    Sku selectByPrimaryKey(Long id);

    int updateByExampleSelective(Sku record, SkuExample example);

    int updateByExample(Sku record, SkuExample example);

    int updateByPrimaryKeySelective(Sku record);

    int updateByPrimaryKey(Sku record);
}