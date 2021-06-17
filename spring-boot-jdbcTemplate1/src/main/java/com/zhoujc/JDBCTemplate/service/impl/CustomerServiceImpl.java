package com.zhoujc.JDBCTemplate.service.impl;

import com.zhoujc.JDBCTemplate.bean.Customer;
import com.zhoujc.JDBCTemplate.dao.CustomerDao;
import com.zhoujc.JDBCTemplate.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao ;

    public void setCustomerDao(CustomerDao customerDao){
        this.customerDao = customerDao;
    }
    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> list = customerDao.findAll();
        return list;
    }
}
