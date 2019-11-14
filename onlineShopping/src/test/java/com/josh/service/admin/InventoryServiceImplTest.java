package com.josh.repository.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.factory.admin.InventoryFactory;
import com.josh.service.admin.impl.InventoryServiceImpl;

import org.junit.Before;

public class InventoryServiceImplTest
{
private InventoryRepository repository;
private Inventory inventory;
private Inventory getSaved()
{
    Set<Inventory> savedInventory = this.repository.getAll();
    return savedInventory.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = InventoryRepositoryImpl.getRepository();
    this.inventory = InventoryFactory.buildInventory(1, "computer", "laptop");
}

@Test
public void a_create()
{
    Inventory createdInventory = this.repository.create(this.inventory);
    System.out.println("in create, createdInventory = " + createdInventory);
    e_getAll();
    Assert.assertSame(createdInventory, this.inventory);
}

@Test
public void b_read()
{
    Inventory savedInventory = getSavedInventory();
    System.out.println("readInventory, inventoryId = " + savedInventory.getId());
    Inventory read = this.repository.read(savedInventory.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedInventory, read);
e_getAll();
}

@Test
public void c_update()
{
    String newInventoryDesc = "new inventory description test";
    Inventory inventory = new Inventory.Builder().copy(getSavedInventory()).inventoryDesc(newInventoryDesc).build();
    System.out.println("about to update = " + inventory);
    Inventory updatedInventory = this.repository.update(inventory);
    System.out.println("updated inventory = " + updatedInventory);
    Assert.assertSame(newInventoryDesc, updatedAccount.getInventoryDesc());
    e_getAll();
}

@Test
public void d_delete()
{
    Account savedInventory = getSavedInventory();
    this.repository.delete(savedInventory.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Inventory> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}