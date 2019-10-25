package com.josh.repository.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Role;
import com.josh.repository.admin.RoleRepository;

public class RoleRepositoryImpl implements RoleRepository {
    private static RoleRepositoryImpl repository = null;
    private Set<Role> r;

    private RoleRepositoryImpl() {
        this.r = new HashSet<>();
    }

    private Role findRole(String roleId) {
        return this.r.stream().filter(r -> r.getId().trim().equals(roleId)).findAny()
                .orElse(null);
    }

    public static RoleRepositoryImpl getRepository() {
        if (repository == null)
            repository = new RoleRepositoryImpl();
        return repository;

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