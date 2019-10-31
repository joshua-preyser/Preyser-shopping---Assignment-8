package com.josh.service.product;

import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.service.IService;

public interface OrderService extends IService<Order, String>
{
Set<Order> getAll();
}