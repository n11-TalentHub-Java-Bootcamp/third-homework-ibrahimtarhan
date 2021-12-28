package com.tarhan.springboot.mongoDb.service;

import com.tarhan.springboot.mongoDb.entity.User;
import com.tarhan.springboot.mongoDb.service.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceConcrete implements UserService{

    @Autowired
    private UserEntityService userEntityService;

    @Override
    public List<User> findAll() {
        return userEntityService.findAll();
    }

    @Override
    public User findById(String id) {
        return userEntityService.findById(id);
    }

    @Override
    public User save(User user) {
        return userEntityService.save(user);
    }

    @Override
    public void delete(String id) {
        userEntityService.deleteById(id);
    }
}
