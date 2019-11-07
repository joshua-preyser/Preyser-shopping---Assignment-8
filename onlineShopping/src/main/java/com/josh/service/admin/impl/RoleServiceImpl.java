package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Role;
import com.josh.repository.admin.RoleRepository;
import com.josh.repository.admin.impl.RoleRepositoryImpl;
import com.josh.service.admin.RoleService;

public class RoleServiceImpl implements RoleService {
    private static RoleServiceImpl service = null;
    private RoleRepository repository;
    private RoleServiceImpl() {
        this.repository = RoleRepository.getRepository();
    }

    public static RoleServiceImpl getService() {
        if (service == null)
            repository = new RoleRepositoryImpl();
        return service;

}

    @Override
    public Role create(Role role) {
        this.r.add(role);
        return role;
    }

    @Override
    public Role update(Role role) {
        Role toUpdate = findRole(role.getId());
        if (toUpdate != null) {
            this.r.remove(toUpdate);
            return create(role);
        }
        return null;
    }

    @Override
    public void delete(String roleId) {
        Account account = findRole(roleId);
        if (role != null)
            this.r.remove(role);
    }

    @Override
    public Role read(final String roleId) {
        Role role = findRole(roleId);
        return role;
    }

    @Override
    public Set<Role> getAll() {

        return this.r;
    }
}