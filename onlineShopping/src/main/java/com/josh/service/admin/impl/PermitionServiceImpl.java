package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.service.admin.PermitionService;

public class PermitionServiceImpl implements PermitionService {
    private static PermitionServiceImpl service = null;
    private CourseRepository repository;

    private PermitionServiceImpl() {
        this.repository = PermitionRepositoryImpl.getRepository();
    }

    public static PermitionServiceImpl getService(){
        if (service == null) service = new PermitionServiceImpl();
        return service;
    }

    @Override
    public Permition create(Permition permit) {
        return this.repository.create(permit);
    }

    @Override
    public Permition update(Permition permit) {
        return this.repository.update(permit);
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
    public Set<Permition> getAll() {
        return this.repository.getAll();
    }
}
