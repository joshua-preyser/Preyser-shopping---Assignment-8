package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.factory.admin.PermitionFactory;
import com.josh.service.admin.impl.PermitionServiceImpl;

import org.junit.Before;

public class PermitionServiceImplTest {
    private PermitionRepositoryImpl repository;
    private Permition permit;

    private Permition getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PermitionRepositoryImpl.getRepository();
        this.permit = PermitionFactory.buildPermition("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Permition created = this.repository.create(this.permit);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.permit);
    }

    @Test
    public void c_update() {
        String newPermitionName = "Application Development Theory 3";
        Permition updated = new Permition.Builder().copy(getSaved()).permitName(newPermitionName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newPermitionName, updated.getPermitionName());
    }

    @Test
    public void e_delete() {
        Permition saved = getSaved();
        this.repository.delete(saved.getPermitionId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Permition saved = getSaved();
        Permition read = this.repository.read(saved.getPermitionId());
        System.out.println("In read, read = " + read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Permition> permits = this.repository.getAll();
        System.out.println("In getall, all = " + permits);
    }
}