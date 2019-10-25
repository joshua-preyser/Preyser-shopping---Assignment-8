package com.josh.repository.product;

import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.repository.IRepository;

public interface OrderRepository extends IRepository<Order, String>
{
Set<Order> getAll();
}