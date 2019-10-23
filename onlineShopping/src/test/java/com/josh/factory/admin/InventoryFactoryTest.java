package com.josh.factory.admin;

import com.josh.domain.admin.Inventory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class InventoryFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildInventory()
    {
        Inventory inventory = InventoryFactory.buildInventory(inventoryId, inventoryDesc, inventoryItem);
        Assert.assertNotNull(inventory.getInventoryId());
        Assert.assertNotNull(inventory.getInventoryDesc());
        Assert.assertNotNull(inventory.getInventoryItem());
        Assert.assertNotNull(inventory);
    }
}