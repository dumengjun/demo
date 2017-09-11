package com.example.demo.user.mapper;

import com.example.demo.user.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User get(Long id);

}
