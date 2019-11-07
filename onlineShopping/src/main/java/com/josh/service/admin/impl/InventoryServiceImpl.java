package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.repository.admin.InventoryRepository;
import com.josh.repository.admin.impl.InventoryRepositoryImpl;
import com.josh.service.admin.InventoryService;

public class InventoryServiceImpl implements InventoryService {
    private static InventoryServiceImpl service = null;
    private InventoryRepository repository;
    private InventoryServiceImpl() {
        this.repository = InventoryRepositoryImpl.getRepository();
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