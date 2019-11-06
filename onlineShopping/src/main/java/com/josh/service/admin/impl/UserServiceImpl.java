package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.service.admin.UserService;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl service = null;
    private UserRepository repository;

    private UserServiceImpl() {
        this.repository = UserRepositoryImpl.getRepository();
    }

    public static UserServiceImpl getService(){
        if (service == null) service = new UserServiceImpl();
        return service;
    }

    @Override
    public User create(User user) {
        return this.repository.create(user);
    }

    @Override
    public User update(User user) {
        return this.repository.update(user);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public User read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<User> getAll() {
        return this.repository.getAll();
    }
}
