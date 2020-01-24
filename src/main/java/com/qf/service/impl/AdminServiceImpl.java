package com.qf.service.impl;

import com.qf.dao.AdminMapper;
import com.qf.entity.Admin;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl  implements AdminService {

    @Autowired
    AdminMapper adminMapper;


    @Override
    public Admin adminLogin(String NAME, String pwd) {
        return adminMapper.adminLogin(NAME,pwd);
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }
}
