package com.zhoujc.test;
import com.zhoujc.JDBCTemplate.Applicaton;
import org.junit.Test;
import com.zhoujc.JDBCTemplate.bean.Customer;
import com.zhoujc.JDBCTemplate.service.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.List;


public class TestJdbc {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        List<Customer> list = customerService.findAllCustomer();
        for (Customer customer : list) {
            System.out.println("customer = " + customer);
        }
    }
}
