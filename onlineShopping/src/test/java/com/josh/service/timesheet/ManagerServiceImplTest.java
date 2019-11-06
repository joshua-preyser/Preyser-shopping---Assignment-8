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
}