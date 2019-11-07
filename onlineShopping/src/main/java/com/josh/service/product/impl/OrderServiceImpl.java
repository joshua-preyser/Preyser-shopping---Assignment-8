package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.service.product.OrderService;

public class OrderServiceImpl implements OrderService {
    private static OrderServiceImpl service = null;
    private OrderRepository repository;

    private OrderServiceImpl() {
        this.repository = OrderRepositoryImpl.getRepository();
    }

    public static OrderServiceImpl getService(){
        if (service == null) service = new OrderServiceImpl();
        return service;
    }

    @Override
    public Order create(Order order) {
        return this.repository.create(order);
    }

    @Override
    public Order update(Order order) {
        return this.repository.update(order);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Order read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Order> getAll() {
        return this.repository.getAll();
    }
}
