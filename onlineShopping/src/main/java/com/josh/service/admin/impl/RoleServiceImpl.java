package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Role;
import com.josh.service.admin.RoleService;

public class RoleServiceImpl implements RoleService {
    private static RoleServiceImpl service = null;
    private RoleRepository repository;

    private RoleServiceImpl() {
        this.repository = RoleRepositoryImpl.getRepository();
    }

    public static RoleServiceImpl getService(){
        if (service == null) service = new RoleServiceImpl();
        return service;
    }

    @Override
    public Role create(Role role) {
        return this.repository.create(role);
    }

    @Override
    public Role update(Role role) {
        return this.repository.update(role);
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
    public Set<Role> getAll() {
        return this.repository.getAll();
    }
}
