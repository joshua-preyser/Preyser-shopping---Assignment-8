package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.service.payroll.UserRateService;

public class UserRateServiceImpl implements UserRateService {
    private static UserRateServiceImpl service = null;
    private UserRateRepository repository;

    private UserRateServiceImpl() {
        this.repository = UserRateRepositoryImpl.getRepository();
    }

    public static UserRateServiceImpl getService(){
        if (service == null) service = new UserRateServiceImpl();
        return service;
    }

    @Override
    public UserRate create(UserRate rate) {
        return this.repository.create(rate);
    }

    @Override
    public UserRate update(UserRate rate) {
        return this.repository.update(rate);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Course read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }
}
