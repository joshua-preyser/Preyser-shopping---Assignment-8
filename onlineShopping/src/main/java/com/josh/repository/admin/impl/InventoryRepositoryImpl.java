package com.josh.repository.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.repository.admin.InventoryRepository;

public class InventoryRepositoryImpl implements AccountRepository {
    private static InventoryRepositoryImpl repository = null;
    private Set<Inventory> stock;

    private InventoryRepositoryImpl() {
        this.stock = new HashSet<>();
    }

    private Inventory findInventory(String inventoryId) {
        return this.stock.stream().filter(stock -> stock.getId().trim().equals(inventoryId)).findAny()
                .orElse(null);
    }

    public static InventoryRepositoryImpl getRepository() {
        if (repository == null)
            repository = new InventoryRepositoryImpl();
        return repository;

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