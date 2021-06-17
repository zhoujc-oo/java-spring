package com.zhoujc.JDBCTemplate.service;

import com.zhoujc.JDBCTemplate.bean.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomer();
}
