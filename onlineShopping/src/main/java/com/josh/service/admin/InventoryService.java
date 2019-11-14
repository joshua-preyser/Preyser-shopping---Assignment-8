package com.josh.service.admin;

import com.josh.service.IService;

import java.util.Set;

import com.josh.domain.admin.Inventory;

public interface InventoryService extends IService<Inventory, String>

{
Set<Inventory> getAll();
}