package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.factory.admin.PermitionFactory;
import com.josh.service.admin.impl.PermitionServiceImpl;

import org.junit.Before;

public class PermitionServiceImplTest
{
private PermitionService service;
private Permition permition;
private Permition getSavedPermition()
{
    Set<Permition> savedPermition = this.service.getAll();
    return savedPermition.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = PermitionServiceImpl.getService();
    this.permition = PermitionFactory.buildPermition(permId, permRoleId, permTitle, permDesc)
}

@Test
public void a_create()
{
    Permition createdPermition = this.service.create(this.permition);
    System.out.println("in create, createdPermition = " + createdPermition);
    e_getAll();
    Assert.assertSame(createdPermition, this.permition);
}

@Test
public void b_read()
{
    Permition savedPermition = getSavedPermition();
    System.out.println("readPermition, permitionId = " + savedPermition.getId());
    Inventory read = this.service.read(savedPermition.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedPermition, read);
e_getAll();
}

@Test
public void c_update()
{
    String newDesc = "new permition desc test";
    Permition permition = new Permition.Builder().copy(getSavedPermition()).desc(newDesc).build();
    System.out.println("about to update = " + permition);
    Permition updatedPermition = this.service.update(permition);
    System.out.println("updated permition = " + updatedPermition);
    Assert.assertSame(newDesc, updatedPermition.getDesc());
    e_getAll();
}

@Test
public void d_delete()
{
    Permition savedPermition = getSavedPermition();
    this.service.delete(savedPermition.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Permition> all = this.service.getAll();
    System.out.println("all = " + all);
}
}