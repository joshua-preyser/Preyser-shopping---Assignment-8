package com.josh.service.product;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.factory.product.OrderFactory;
import com.josh.service.product.impl.OrderServiceImpl;

import org.junit.Before;

public class OrderServiceImplTest {

    private OrderRepositoryImpl repository;
    private Order order;

    private Order getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = OrderRepositoryImpl.getRepository();
        this.order = OrderFactory.buildOrder("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Order created = this.repository.create(this.order);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.order);
    }

    @Test
    public void c_update() {
        String newOrderName = "Application Development Theory 3";
        Order updated = new Order.Builder().copy(getSaved()).orderName(newOrderName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newOrderName, updated.getOrderName());
    }

    @Test
    public void e_delete() {
        Order saved = getSaved();
        this.repository.delete(saved.getOrderId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Order saved = getSaved();
        Order read = this.repository.read(saved.getOrderId());
        System.out.println("In read, read = " + read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Order> orders = this.repository.getAll();
        System.out.println("In getall, all = " + orders);
    }
}