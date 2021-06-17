package com.zhoujc.JDBCTemplate.dao.impl;


import com.zhoujc.JDBCTemplate.bean.Customer;
import com.zhoujc.JDBCTemplate.dao.CustomerDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> list = jdbcTemplate.query("select * from cst_customer",
                new BeanPropertyRowMapper<Customer>(Customer.class));
        return list;
    }
}
