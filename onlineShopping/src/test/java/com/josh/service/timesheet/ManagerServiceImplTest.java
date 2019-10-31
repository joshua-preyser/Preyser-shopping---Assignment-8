package com.josh.service.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Manager;
import com.josh.factory.timesheet.ManagerFactory;
import com.josh.service.timesheet.impl.ManagerServiceImpl;

import org.junit.Before;

public class ManagerServiceImplTest
{
private ManagerService service;
private Manager manager;
private Manager getSavedManager()
{
    Set<Manager> savedManager = this.service.getAll();
    return savedManager.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = ManagerServiceImpl.getService();
    this.manager = ManagerFactory.buildManager(name)
}

@Test
public void a_create()
{
    Manager createdManager = this.service.create(this.manager);
    System.out.println("in create, createdManager = " + createdManager);
    e_getAll();
    Assert.assertSame(createdManager, this.manager);
}

@Test
public void b_read()
{
    Manager savedManager = getSavedManager();
    System.out.println("readManager, managerName = " + savedManager.getName());
    Manager read = this.service.read(savedManager.getName());
    System.out.println("read = " + read);
    Assert.assertEquals(savedManager, read);
e_getAll();
}

@Test
public void c_update()
{
    String newName = "new manager name test";
    Manager manager = new Manager.Builder().copy(getSavedManager()).name(newName).build();
    System.out.println("about to update = " + manager);
    Manager updatedManager = this.service.update(manager);
    System.out.println("updated manager = " + updatedManager);
    Assert.assertSame(newName, updatedManager.getName());
    e_getAll();
}

@Test
public void d_delete()
{
    Manager savedManager = getSavedManager();
    this.servicey.delete(savedManager.getName());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Manager> all = this.service.getAll();
    System.out.println("all = " + all);
}
}