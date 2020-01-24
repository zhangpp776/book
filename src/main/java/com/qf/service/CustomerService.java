package com.qf.service;

import com.qf.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerService {


    public Customer customerLogin(String NAME,String pwd);

    public List<Customer> findAllCustomer();

    public int delCustomerById(Integer id);

    public int addCustomer(Customer customer);
}
