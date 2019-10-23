package com.josh.domain.admin;


public class Inventory
{
    private int inventoryId;
    private String inventoryDesc;
    private String inventoryItem;

    private Inventory()
    {
    }

    public Inventory(Builder builder) {
        this.inventoryId = builder.inventoryId;
        this.inventoryDesc = builder.inventoryDesc;
        this.inventoryItem = builder.inventoryItem;
    }

    public int getInventoryId()
    {
        return inventoryId;
    }

    public String getInventoryDesc()
    {
        return inventoryDesc;
    }
    public String getInventoryItem()
    {
        return inventoryItem;
    }

    public static class Builder
    {
    private int inventoryId;
    private String inventoryDesc;
    private String inventoryItem;

        public Builder inventoryId(int inventoryId)
        {
        this.inventoryId = inventoryId;
        return this;
        }
        public Builder inventoryDesc(String inventoryDesc)
        {
        this.inventoryDesc = inventoryDesc;
        return this;
        }
        public Builder inventoryItem(String inventoryItem)
        {
        this.inventoryItem = inventoryItem;
        return this;
        }

        public Builder copy(Inventory inventory)
        {
        this.inventoryId = inventory.inventoryId;
        this.inventoryDesc = inventory.inventoryDesc;
        this.inventoryItem = inventory.inventoryItem;
        return this;
        }

        public Inventory build()
        {
        return new Inventory(this);
        }

    }

    @Override
    public String toString() {
        return "Inventory [inventoryDesc=" + inventoryDesc + ", inventoryId=" + inventoryId + ", inventoryItem="
                + inventoryItem + "]";
    }


}