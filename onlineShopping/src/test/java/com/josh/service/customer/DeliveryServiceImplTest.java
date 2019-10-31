package com.josh.service.customer;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.customer.Delivery;
import com.josh.factory.customer.DeliveryFactory;
import com.josh.service.customer.impl.DeliveryServiceImpl;

import org.junit.Before;

public class DeliveryServiceImplTest
{
private DeliveryService service;
private Delivery delivery;
private Delivery getSavedDelivery()
{
    Set<Delivery> savedDelivery = this.service.getAll();
    return savedDelivery.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = DeliveryRepositoryImpl.getRepository();
    this.delivery = DeliveryFactory.buildDelivery(deliveryId, orderId, deliveryDate, address)
}

@Test
public void a_create()
{
    Delivery createdDelivery = this.service.create(this.delivery);
    System.out.println("in create, createdDelivery = " + createdDelivery);
    e_getAll();
    Assert.assertSame(createdDelivery, this.delivery);
}

@Test
public void b_read()
{
    Delivery savedDelivery = getSavedDelivery();
    System.out.println("readDelivery, deliveryId = " + savedDelivery.getId());
    Delivery read = this.service.read(savedDelivery.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedDelivery, read);
e_getAll();
}

@Test
public void c_update()
{
    String newAddress = "new delivery address test";
    Delivery delivery = new Delivery.Builder().copy(getSavedDelivery()).address(newAddress).build();
    System.out.println("about to update = " + delivery);
    Delivery updatedDelivery = this.service.update(delivery);
    System.out.println("updated delivery = " + updatedDelivery);
    Assert.assertSame(newAddress, updatedDelivery.getAddress());
    e_getAll();
}

@Test
public void d_delete()
{
    Delivery savedDelivery = getSavedDelivery();
    this.service.delete(savedDelivery.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Delivery> all = this.service.getAll();
    System.out.println("all = " + all);
}
}