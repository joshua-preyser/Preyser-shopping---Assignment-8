package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.repository.product.OrderRepository;
import com.josh.repository.product.impl.OrderRepositoryImpl;
import com.josh.service.product.OrderService;

public class OrderServiceImpl implements OrderService {
    private static OrderServiceImpl service = null;
    private OrderRepository repository;

    private OrderServiceImpl() {
<<<<<<< HEAD
        this.repository = OrderRepository.getRepository();
    }

    public static OrderServiceImpl getService() {
        if (service == null)
            service = new OrderServiceImpl();
=======
        this.repository = OrderRepositoryImpl.getRepository();
    }

    public static OrderServiceImpl getService(){
        if (service == null) service = new OrderServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
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
