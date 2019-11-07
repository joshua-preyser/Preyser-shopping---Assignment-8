package com.josh.repository.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.Order;
import com.josh.factory.product.OrderFactory;
import com.josh.service.product.impl.OrderServiceImpl;

import org.junit.Before;

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
}