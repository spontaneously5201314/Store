package com.spon.mapper;

import com.spon.domain.Employee;
import com.spon.domain.EmployeeExample;
import java.util.List;

public interface EmployeeDAO {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String username);

    void insert(Employee record);

    void insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String username);

    int updateByExampleSelective(Employee record, EmployeeExample example);

    int updateByExample(Employee record, EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}