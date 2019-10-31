package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.factory.admin.UserFactory;
import com.josh.service.admin.impl.UserServiceImpl;

import org.junit.Before;

public class UserServiceImplTest
{
private UserService service;
private User user;
private User getSavedUser()
{
    Set<User> savedUser = this.service.getAll();
    return savedUser.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = UserServiceImpl.getService();
    this.user = UserFactory.buildUser(userId, userRoleId, userName, userEmail, userDob, userAddress)
}

@Test
public void a_create()
{
    User createdUser = this.service.create(this.user);
    System.out.println("in create, createdUser = " + createdUser);
    e_getAll();
    Assert.assertSame(createdUser, this.user);
}

@Test
public void b_read()
{
    User savedUser = getSavedUser();
    System.out.println("readUser, userId = " + savedUser.getId());
    User read = this.service.read(savedUser.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedUser, read);
e_getAll();
}

@Test
public void c_update()
{
    String newAddress = "new user address test";
    User user = new User.Builder().copy(getSavedUser()).address(newAddress).build();
    System.out.println("about to update = " + user);
    User updatedUser = this.service.update(user);
    System.out.println("updated user = " + updatedUser);
    Assert.assertSame(newAddress, updatedUser.getAddress());
    e_getAll();
}

@Test
public void d_delete()
{
    User savedUser = getSavedUser();
    this.service.delete(savedUser.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<User> all = this.service.getAll();
    System.out.println("all = " + all);
}
}