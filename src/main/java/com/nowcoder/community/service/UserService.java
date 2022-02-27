package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.LoginTicket;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

//    @Value("${community.path.domain}")
//    private String domain;
//
//    @Value("${server.servlet.context-path}")
//    private String contextPath;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }


}