package com.josh.repository.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.factory.admin.UserFactory;
import com.josh.service.admin.impl.UserServiceImpl;

import org.junit.Before;

public class UserServiceImplTest
{
private UserRepository repository;
private User user;
private User getSaved()
{
    Set<User> savedUser = this.repository.getAll();
    return savedUser.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = UserRepositoryImpl.getRepository();
    this.user = UserFactory.buildUser(1, 1, "Joshua Preyser", "preyser@gmail.com", 94/03/18, "29 Heerengracht Road, Bergvliet");
}

@Test
public void a_create()
{
    User createdUser = this.repository.create(this.user);
    System.out.println("in create, createdUser = " + createdUser);
    e_getAll();
    Assert.assertSame(createdUser, this.user);
}

@Test
public void b_read()
{
    User savedUser = getSavedUser();
    System.out.println("readUser, userId = " + savedUser.getId());
    User read = this.repository.read(savedUser.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedUser, read);
e_getAll();
}

@Test
public void c_update()
{
    String newUserName = "new user name test";
    User user = new User.Builder().copy(getSavedUser()).userName(newUserName).build();
    System.out.println("about to update = " + user);
    User updatedUser = this.repository.update(user);
    System.out.println("updated user = " + updatedUser);
    Assert.assertSame(newUserName, updatedUser.getUserName());
    e_getAll();
}

@Test
public void d_delete()
{
    User savedUser = getSavedUser();
    this.repository.delete(savedUser.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<User> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}