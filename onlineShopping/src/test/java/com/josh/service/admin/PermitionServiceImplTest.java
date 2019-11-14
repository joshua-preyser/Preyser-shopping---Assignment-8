package com.josh.repository.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.factory.admin.PermitionFactory;
import com.josh.service.admin.impl.PermitionServiceImpl;

import org.junit.Before;

public class PermitionServiceImplTest
{
private PermitionRepository repository;
private Permition permition;
private Permition getSaved()
{
    Set<Permition> savedPermition = this.repository.getAll();
    return savedPermition.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = PermitionRepositoryImpl.getRepository();
    this.permition = PermitionFactory.buildPermition(1, 1, "admin", "administrator");
}

@Test
public void a_create()
{
    Permition createdPermition = this.repository.create(this.permition);
    System.out.println("in create, createdPermition = " + createdPermition);
    e_getAll();
    Assert.assertSame(createdPermition, this.permition);
}

@Test
public void b_read()
{
    Permition savedPermition = getSavedPermition();
    System.out.println("readPermition, permId = " + savedPermition.getId());
    Permition read = this.repository.read(savedPermition.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedPermition, read);
e_getAll();
}

@Test
public void c_update()
{
    String newPermDesc = "new permition description test";
    Permition permition = new Permition.Builder().copy(getSavedPermition()).permDesc(newPermDesc).build();
    System.out.println("about to update = " + permition);
    Account updatedAccount = this.repository.update(permition);
    System.out.println("updated permition = " + updatedPermition);
    Assert.assertSame(newPermDesc, updatedPermition.getPermDesc());
    e_getAll();
}

@Test
public void d_delete()
{
    Permition savedPermition = getSavedPermition();
    this.repository.delete(savedPermition.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Permition> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}