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
private RoleService service;
private Role role;
private Role getSavedRole()
{
    Set<Role> savedRole = this.service.getAll();
    return savedRole.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = RoleServiceImpl.getService();
    this.role = RoleFactory.buildRole(roleId, roleTitle, roleDesc)
}

@Test
public void a_create()
{
    Role createdRole = this.service.create(this.role);
    System.out.println("in create, createdRole = " + createdRole);
    e_getAll();
    Assert.assertSame(createdRole, this.role);
}

@Test
public void b_read()
{
    Role savedRole = getSavedRole();
    System.out.println("readRole, roleId = " + savedRole.getId());
    Role read = this.service.read(savedRole.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedRole, read);
e_getAll();
}

@Test
public void c_update()
{
    String newDesc = "new role desc test";
    Role role = new Role.Builder().copy(getSavedRole()).desc(newDesc).build();
    System.out.println("about to update = " + role);
    Role updatedRole = this.service.update(role);
    System.out.println("updated role = " + updatedRole);
    Assert.assertSame(newDesc, updatedRole.getDesc());
    e_getAll();
}

@Test
public void d_delete()
{
    Role savedRole = getSavedRole();
    this.service.delete(savedRole.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Role> all = this.service.getAll();
    System.out.println("all = " + all);
}
}