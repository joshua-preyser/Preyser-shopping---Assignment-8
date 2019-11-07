package com.josh.repository.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Manager;
import com.josh.factory.timesheet.ManagerFactory;
import com.josh.service.timesheet.impl.ManagerRepositoryImpl;

import org.junit.Before;

public class ManagerServiceImplTest
{
<<<<<<< HEAD
private ManagerRepository repository;
private Manager manager;
private Manager getSaved()
{
    Set<Manager> savedManager = this.repository.getAll();
    return savedManager.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = ManagerRepositoryImpl.getRepository();
    this.manager = ManagerFactory.buildManager(name)
}

@Test
public void a_create()
{
    Manager createdManager = this.repository.create(this.manager);
    System.out.println("in create, createdManager = " + createdManager);
    e_getAll();
    Assert.assertSame(createdManager, this.manager);
}

@Test
public void b_read()
{
    Manager savedManager = getSavedManager();
    System.out.println("readManager, managerName = " + savedManager.getName());
    Manager read = this.repository.read(savedManager.getName());
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
    Manager updatedManager = this.repository.update(manager);
    System.out.println("updated manager = " + updatedManager);
    Assert.assertSame(newName, updatedManager.getName());
    e_getAll();
}

@Test
public void d_delete()
{
    Manager savedManager = getSavedManager();
    this.repository.delete(savedManager.getName());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Manager> all = this.repository.getAll();
    System.out.println("all = " + all);
}
=======

    private ManagerRepositoryImpl repository;
    private Manager manager;

    private Manager getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ManagerRepositoryImpl.getRepository();
        this.manager = ManagerFactory.buildManager("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Manager created = this.repository.create(this.manager);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.manager);
    }

    @Test
    public void c_update() {
        String newManagerName = "Application Development Theory 3";
        Manager updated = new Manager.Builder().copy(getSaved()).managerName(newManagerName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newManagerName, updated.getManagerName());
    }

    @Test
    public void e_delete() {
        Manager saved = getSaved();
        this.repository.delete(saved.getManagerId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Manager saved = getSaved();
        Manager read = this.repository.read(saved.getManagerId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Manager> managers = this.repository.getAll();
        System.out.println("In getall, all = " + managers);
    }
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}