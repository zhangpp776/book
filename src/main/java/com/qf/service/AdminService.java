package com.qf.service;

import com.qf.entity.Admin;

public interface AdminService {

    public Admin adminLogin( String NAME,String pwd);

    public int addAdmin(Admin admin);
}
