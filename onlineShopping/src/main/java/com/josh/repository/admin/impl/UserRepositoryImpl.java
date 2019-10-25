package com.josh.repository.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.repository.admin.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl repository = null;
    private Set<User> u;

    private UserRepositoryImpl() {
        this.u = new HashSet<>();
    }

    private User findUser(String userId) {
        return this.u.stream().filter(u -> u.getId().trim().equals(userId)).findAny()
                .orElse(null);
    }

    public static UserRepositoryImpl getRepository() {
        if (repository == null)
            repository = new UserRepositoryImpl();
        return repository;

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