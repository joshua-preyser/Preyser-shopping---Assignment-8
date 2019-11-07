package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.repository.payroll.UserRateRepository;
import com.josh.repository.payroll.impl.UserRateRepositoryImpl;
import com.josh.service.payroll.UserRateService;

public class UserRateServiceImpl implements UserRateService {
    private static UserRateServiceImpl service = null;
    private UserRateRepository repository;

    private UserRateServiceImpl() {
<<<<<<< HEAD
        this.repository = UserRateRepository.getRepository();
    }

    public static UserRateServiceImpl getService() {
        if (service == null)
            service = new UserRateServiceImpl();
=======
        this.repository = UserRateRepositoryImpl.getRepository();
    }

    public static UserRateServiceImpl getService(){
        if (service == null) service = new UserRateServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
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
