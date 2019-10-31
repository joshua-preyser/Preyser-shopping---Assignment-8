package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.factory.admin.InventoryFactory;
import com.josh.service.admin.impl.InventoryServiceImpl;

import org.junit.Before;

public class InventoryServiceImplTest
{
private InventoryService service;
private Inventory inventory;
private Inventory getSavedInventory()
{
    Set<Inventory> savedInventory = this.service.getAll();
    return savedInventory.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = InventoryServiceImpl.getService();
    this.inventory = InventoryFactory.buildInventory(inventoryId, inventoryDesc, inventoryItem)
}

@Test
public void a_create()
{
    Inventory createdInventory = this.service.create(this.inventory);
    System.out.println("in create, created inventory = " + createdInventory);
    e_getAll();
    Assert.assertSame(createdInventory, this.inventory);
}

@Test
public void b_read()
{
    Inventory savedInventory = getSavedInventory();
    System.out.println("readInventory, inventoryId = " + savedInventory.getId());
    Inventory read = this.service.read(savedInventory.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedInventory, read);
e_getAll();
}

@Test
public void c_update()
{
    String newItem = "new inventory item test";
    Inventory inventory = new Inventory.Builder().copy(getSavedInventory()).item(newItem).build();
    System.out.println("about to update = " + inventory);
    Inventory updatedInventory = this.service.update(inventory);
    System.out.println("updated inventory = " + updatedInventory);
    Assert.assertSame(newItem, updatedInventory.getItem());
    e_getAll();
}

@Test
public void d_delete()
{
    Inventory savedInventory = getSavedInventory();
    this.service.delete(savedInventory.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Inventory> all = this.service.getAll();
    System.out.println("all = " + all);
}
}