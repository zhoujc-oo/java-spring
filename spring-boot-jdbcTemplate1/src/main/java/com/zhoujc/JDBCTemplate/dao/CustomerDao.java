package com.zhoujc.JDBCTemplate.dao;

import com.zhoujc.JDBCTemplate.bean.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();

}
