package com.qf.service.impl;

import com.qf.dao.CustomerMapper;
import com.qf.entity.Customer;
import com.qf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Customer customerLogin(String NAME, String pwd) {
        return customerMapper.customerLogin(NAME,pwd);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerMapper.findAllCustomer();
    }

    @Override
    public int delCustomerById(Integer id) {
        return customerMapper.delCustomerById(id);
    }

    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }
}
