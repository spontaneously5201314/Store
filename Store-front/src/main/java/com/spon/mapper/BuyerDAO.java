package com.spon.mapper;

import com.spon.domain.Buyer;
import com.spon.domain.BuyerExample;
import java.util.List;

public interface BuyerDAO {
    int countByExample(BuyerExample example);

    int deleteByExample(BuyerExample example);

    int deleteByPrimaryKey(String username);

    void insert(Buyer record);

    void insertSelective(Buyer record);

    List<Buyer> selectByExample(BuyerExample example);

    Buyer selectByPrimaryKey(String username);

    int updateByExampleSelective(Buyer record, BuyerExample example);

    int updateByExample(Buyer record, BuyerExample example);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}