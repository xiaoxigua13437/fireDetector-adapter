package com.quantongfu.adapter.service;

import com.quantongfu.adapter.dao.UserDao;
import com.quantongfu.adapter.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhaofang on 2018/8/14.
 */
@Controller
@RequestMapping("/service")
public class Service {

    @Autowired
    UserDao userDao;

    @RequestMapping("/user")
    public void findByUserName(){
        String userName = "admin";
        User user = userDao.findByUserName(userName);
        System.out.println("========="+user);


    }



}
