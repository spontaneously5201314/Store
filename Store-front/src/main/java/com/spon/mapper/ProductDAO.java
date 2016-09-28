package com.spon.mapper;

import com.spon.domain.Product;
import com.spon.domain.ProductExample;
import com.spon.domain.ProductWithBLOBs;
import java.util.List;

public interface ProductDAO {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Long id);

    void insert(ProductWithBLOBs record);

    void insertSelective(ProductWithBLOBs record);

    List<ProductWithBLOBs> selectByExampleWithBLOBs(ProductExample example);

    List<Product> selectByExampleWithoutBLOBs(ProductExample example);

    ProductWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(ProductWithBLOBs record, ProductExample example);

    int updateByExample(ProductWithBLOBs record, ProductExample example);

    int updateByExample(Product record, ProductExample example);

    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    int updateByPrimaryKey(ProductWithBLOBs record);

    int updateByPrimaryKey(Product record);
}