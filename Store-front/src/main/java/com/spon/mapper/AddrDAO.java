package com.spon.mapper;

import com.spon.domain.Addr;
import com.spon.domain.AddrExample;

import java.util.List;

public interface AddrDAO {
    int countByExample(AddrExample example);

    int deleteByExample(AddrExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Addr record);

    void insertSelective(Addr record);

    List<Addr> selectByExample(AddrExample example);

    Addr selectByPrimaryKey(Long id);

    int updateByExampleSelective(Addr record, AddrExample example);

    int updateByExample(Addr record, AddrExample example);

    int updateByPrimaryKeySelective(Addr record);

    int updateByPrimaryKey(Addr record);
}