package com.qf.controller;

import com.qf.dao.AdminMapper;
import com.qf.dao.CustomerMapper;
import com.qf.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "behind/register";
    }

    @RequestMapping("/loginout1")
    public String loginout1(){
        return "behind/login";
    }

    @RequestMapping("/tologin")
    public String tologin(){
        return "behind/login";
    }

    @RequestMapping("/login")
    public String login(String NAME, String pwd, Model model, HttpSession session){
        Admin admin = adminMapper.adminLogin(NAME, pwd);
        session.setAttribute("admin",admin);
        if(admin!=null ){
            session.setAttribute("NAME",NAME);
            model.addAttribute("admin",admin);
            return "redirect:/book/findAllbook";
        }else{
            return "false";
        }
    }

    @RequestMapping("/add")
    public String addAdmin(String NAME,String pwd){
        Admin admin = new Admin(NAME, pwd);
        int i = adminMapper.addAdmin(admin);
        if(i==1){
            return "redirect:/admin/tologin";
        }
        return null;
    }

}
