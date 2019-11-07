package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.repository.admin.UserRepository;
import com.josh.repository.admin.impl.UserRepositoryImpl;
import com.josh.service.admin.UserService;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl service = null;
    private UserRepository repository;

    private UserServiceImpl() {
        this.repository = UserRepository.getRepository();
    }

    public static UserServiceImpl getService() {
        if (service == null)
            service = new UserServiceImpl();
        return service;

}

    @Override
    public User create(User user) {
        this.u.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        User toUpdate = findUser(user.getId());
        if (toUpdate != null) {
            this.u.remove(toUpdate);
            return create(user);
        }
        return null;
    }

    @Override
    public void delete(String userId) {
        User user = findUser(userId);
        if (user != null)
            this.u.remove(user);
    }

    @Override
    public User read(final String userId) {
        User user = findUser(userId);
        return user;
    }

    @Override
    public Set<User> getAll() {

        return this.u;
    }
}