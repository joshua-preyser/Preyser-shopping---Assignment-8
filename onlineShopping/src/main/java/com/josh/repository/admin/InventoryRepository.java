package com.josh.repository.admin;

import com.josh.repository.IRepository;

import java.util.Set;

import com.josh.domain.admin.Inventory;

public interface InventoryRepository extends IRepository<Inventory, String>
{
Set<Inventory> getAll();
}