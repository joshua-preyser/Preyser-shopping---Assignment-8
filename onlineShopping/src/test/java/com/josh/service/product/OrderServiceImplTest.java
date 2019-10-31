package com.josh.service.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.factory.product.OrderFactory;
import com.josh.service.product.impl.OrderServiceImpl;

import org.junit.Before;

public class OrderServiceImplTest
{
private OrderRepository service;
private Order order;
private Order getSavedOrder()
{
    Set<Order> savedOrder = this.service.getAll();
    return savedOrder.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = OrderServiceImpl.getService();
    this.order = OrderFactory.buildOrder(orderId, customerId, dateAdded)
}

@Test
public void a_create()
{
    Order createdOrder = this.service.create(this.order);
    System.out.println("in create, createdOrder = " + createdOrdert);
    e_getAll();
    Assert.assertSame(createdOrder, this.order);
}

@Test
public void b_read()
{
    Order savedOrder = getSavedOrder();
    System.out.println("readOrder, orderId = " + savedOrder.getId());
    Order read = this.service.read(savedOrder.getId());
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
    Order updatedOrder = this.service.update(order);
    System.out.println("updated order id = " + updatedOrder);
    Assert.assertSame(newOrderId, updatedOrder.getId());
    e_getAll();
}

@Test
public void d_delete()
{
    order savedOrder = getSavedOrder();
    this.service.delete(savedOrder.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Order> all = this.service.getAll();
    System.out.println("all = " + all);
}
}