package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Role;
import com.josh.factory.admin.RoleFactory;
import com.josh.service.admin.impl.RoleRepositoryImpl;

import org.junit.Before;

public class RoleServiceImplTest
{
    private RoleRepositoryImpl repository;
    private Role role;

    private Role getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RoleRepositoryImpl.getRepository();
        this.role = RoleFactory.buildRole("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Role created = this.repository.create(this.role);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.role);
    }

    @Test
    public void c_update() {
        String newRoleName = "Application Development Theory 3";
        Role updated = new Role.Builder().copy(getSaved()).roleName(newRoleName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newRoleName, updated.getRoleName());
    }

    @Test
    public void e_delete() {
        Role saved = getSaved();
        this.repository.delete(saved.getRoleId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Role saved = getSaved();
        Role read = this.repository.read(saved.getRoleId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Role> roles = this.repository.getAll();
        System.out.println("In getall, all = " + roles);
    }
}