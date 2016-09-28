package com.spon.mapper;

import com.spon.domain.Order;
import com.spon.domain.OrderExample;
import java.util.List;

public interface OrderDAO {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Order record);

    void insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Long id);

    int updateByExampleSelective(Order record, OrderExample example);

    int updateByExample(Order record, OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}