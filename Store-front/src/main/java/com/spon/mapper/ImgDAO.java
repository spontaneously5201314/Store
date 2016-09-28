package com.spon.mapper;

import com.spon.domain.Img;
import com.spon.domain.ImgExample;
import java.util.List;

public interface ImgDAO {
    int countByExample(ImgExample example);

    int deleteByExample(ImgExample example);

    int deleteByPrimaryKey(Long id);

    void insert(Img record);

    void insertSelective(Img record);

    List<Img> selectByExample(ImgExample example);

    Img selectByPrimaryKey(Long id);

    int updateByExampleSelective(Img record, ImgExample example);

    int updateByExample(Img record, ImgExample example);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}