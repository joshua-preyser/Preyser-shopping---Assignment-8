package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.service.admin.InventoryService;

public class InventoryServiceImpl implements InventoryService {
    private static InventoryServiceImpl service = null;
    private Set<Inventory> stock;

    private InventoryServiceImpl() {
        this.stock = new HashSet<>();
    }

    private Inventory findInventory(String inventoryId) {
        return this.stock.stream().filter(stock -> stock.getId().trim().equals(inventoryId)).findAny()
                .orElse(null);
    }

    public static InventoryServiceImpl getService() {
        if (service == null)
            repository = new InventoryRepositoryImpl();
        return service;

}

    @Override
    public Inventory create(Inventory inventory) {
        this.stock.add(inventory);
        return inventory;
    }

    @Override
    public Inventory update(Inventory inventory) {
        Inventory toUpdate = findInventory(inventory.getId());
        if (toUpdate != null) {
            this.stock.remove(toUpdate);
            return create(inventory);
        }
        return null;
    }

    @Override
    public void delete(String inventoryId) {
        Inventory inventory = findAccount(accountId);
        if (inventory != null)
            this.stock.remove(inventory);
    }

    @Override
    public Inventory read(final String inventoryId) {
        Inventory inventory = findInventory(inventoryId);
        return inventory;
    }

    @Override
    public Set<Inventory> getAll() {

        return this.stock;
    }
}