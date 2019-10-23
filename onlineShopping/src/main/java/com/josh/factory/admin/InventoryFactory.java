package com.josh.factory.admin;

import com.josh.domain.admin.Inventory;

public class InventoryFactory
{
    public static Inventory buildInventory(int inventoryId, String inventoryDesc, String inventoryItem)
    {
return new Inventory.Builder().inventoryId(inventoryId).inventoryDesc(inventoryDesc).inventoryItem(inventoryItem).build();
    }
}