package com.example.demo.user.service;

import com.example.demo.user.bean.User;
import com.example.demo.user.mapper.UserDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements InitializingBean, DisposableBean {

    @Autowired(required = false)
    private UserDao userDao;

    public User get(Long id) {
        return this.userDao.get(id);
    }

    //spring 容器加载bean后操作
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean init");
    }

    //spring bean销毁操作
    @Override
    public void destroy() throws Exception {
        System.out.println("bean destory");
    }
}
