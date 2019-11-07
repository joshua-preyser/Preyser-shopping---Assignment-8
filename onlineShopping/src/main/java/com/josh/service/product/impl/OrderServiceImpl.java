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
        this.repository = OrderRepository.getRepository();
    }

    public static OrderServiceImpl getService() {
        if (service == null)
            service = new OrderServiceImpl();
        return service;

}

    @Override
    public Order create(Order order) {
        this.o.add(order);
        return order;
    }

    @Override
    public Order update(Order order) {
        Order toUpdate = findOrder(order.getId());
        if (toUpdate != null) {
            this.o.remove(toUpdate);
            return create(order);
        }
        return null;
    }

    @Override
    public void delete(String orderId) {
        Order order = findOrder(orderId);
        if (order != null)
            this.o.remove(order);
    }

    @Override
    public Order read(final String orderId) {
        Order order = findOrder(orderId);
        return order;
    }

    @Override
    public Set<Order> getAll() {

        return this.o;
    }
}