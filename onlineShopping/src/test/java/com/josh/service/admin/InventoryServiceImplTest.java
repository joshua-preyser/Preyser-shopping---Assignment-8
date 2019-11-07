package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.factory.admin.InventoryFactory;
import com.josh.service.admin.impl.InventoryServiceImpl;

import org.junit.Before;

public class InventoryServiceImplTest {
    private InventoryRepositoryImpl repository;
    private Inventory ventor;

    private Inventory getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = InventoryRepositoryImpl.getRepository();
        this.ventor = InventoryFactory.buildInventory("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Inventory created = this.repository.create(this.ventor);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.ventor);
    }

    @Test
    public void c_update() {
        String newInventoryName = "Application Development Theory 3";
        Inventory updated = new Inventory.Builder().copy(getSaved()).ventorName(newInventoryName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newInventoryName, updated.getInventoryName());
    }

    @Test
    public void e_delete() {
        Inventory saved = getSaved();
        this.repository.delete(saved.getInventoryId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Inventory saved = getSaved();
        Inventory read = this.repository.read(saved.getInventoryId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Inventory> ventors = this.repository.getAll();
        System.out.println("In getall, all = " + ventors);
    }
}