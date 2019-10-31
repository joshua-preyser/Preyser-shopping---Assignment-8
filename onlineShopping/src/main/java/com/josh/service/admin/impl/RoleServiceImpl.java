package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Role;
import com.josh.service.admin.RoleService;

public class RoleServiceImpl implements RoleService {
    private static RoleServiceImpl service = null;
    private Set<Role> r;

    private RoleServiceImpl() {
        this.r = new HashSet<>();
    }

    private Role findRole(String roleId) {
        return this.r.stream().filter(r -> r.getId().trim().equals(roleId)).findAny()
                .orElse(null);
    }

    public static RoleServiceImpl getService() {
        if (service == null)
            service = new RoleServiceImpl();
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