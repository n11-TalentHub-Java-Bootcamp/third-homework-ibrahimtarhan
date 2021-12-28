package com.tarhan.springboot.mongoDb.service;

import com.tarhan.springboot.mongoDb.entity.Category;
import com.tarhan.springboot.mongoDb.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(String id) ;

    User save(User user);

    void delete(String id) ;
}
