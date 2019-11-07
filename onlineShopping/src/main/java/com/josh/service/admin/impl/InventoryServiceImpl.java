package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Inventory;
import com.josh.service.admin.InventoryService;

public class InventoryServiceImpl implements InventoryService {
    private static InventoryServiceImpl service = null;
    private InventoryRepository repository;

    private InventoryServiceImpl() {
        this.repository = InventoryRepositoryImpl.getRepository();
    }

    public static InventoryServiceImpl getService(){
        if (service == null) service = new InventoryServiceImpl();
        return service;
    }

    @Override
    public Inventory create(Inventory inventory) {
        return this.repository.create(inventory);
    }

    @Override
    public Inventory update(Inventory inventory) {
        return this.repository.update(inventory);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Inventory read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Inventory> getAll() {
        return this.repository.getAll();
    }
}
