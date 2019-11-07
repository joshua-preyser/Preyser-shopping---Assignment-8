package com.josh.repository.product;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.factory.product.OrderFactory;
import com.josh.service.product.impl.OrderServiceImpl;

import org.junit.Before;

<<<<<<< HEAD
public class OrderServiceImplTest
{
private OrderRepository repository;
private Order order;
private Order getSaved()
{
    Set<Order> savedOrder = this.repository.getAll();
    return savedOrder.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = OrderRepositoryImpl.getRepository();
    this.order = OrderFactory.buildOrder(orderId, customerId, dateAdded)
}

@Test
public void a_create()
{
    Order createdOrder = this.repository.create(this.order);
    System.out.println("in create, createdOrder = " + createdOrdert);
    e_getAll();
    Assert.assertSame(createdOrder, this.order);
}

@Test
public void b_read()
{
    Order savedOrder = getSavedOrder();
    System.out.println("readOrder, orderId = " + savedOrder.getId());
    Order read = this.repository.read(savedOrder.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedOrder, read);
e_getAll();
}

@Test
public void c_update()
{
    String newOrderId = "new order id test";
    Order order = new Order.Builder().copy(getSavedOrder()).orderId(newOrderId).build();
    System.out.println("about to update = " + order);
    Order updatedOrder = this.repository.update(order);
    System.out.println("updated order id = " + updatedOrder);
    Assert.assertSame(newOrderId, updatedOrder.getId());
    e_getAll();
}

@Test
public void d_delete()
{
    order savedOrder = getSavedOrder();
    this.repository.delete(savedOrder.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Order> all = this.repository.getAll();
    System.out.println("all = " + all);
}
=======
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
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}