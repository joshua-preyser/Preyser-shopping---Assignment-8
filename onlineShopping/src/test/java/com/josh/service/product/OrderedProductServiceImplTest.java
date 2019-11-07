package com.josh.repository.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.factory.product.OrderedProductFactory;
import com.josh.service.product.impl.OrderedProductServiceImpl;

import org.junit.Before;

public class OrderedProductRepositoryImplTest
{
<<<<<<< HEAD
private OrderedProductRepository repository;
private OrderedProduct orderedProduct;
private OrderedProduct getSaved()
{
    Set<OrderedProduct> savedOrderedProduct = this.repository.getAll();
    return savedOrderedProduct.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = OrderedProductRepositoryImpl.getRepository();
    this.orderedProduct = OrderedProductFactory.buildOrderedProduct(productId, productName, productDesc)
}

@Test
public void a_create()
{
    OrderedProduct createdOrderedProduct = this.repository.create(this.orderedProduct);
    System.out.println("in create, createdOrderedProduct = " + createdOrderedProduct);
    e_getAll();
    Assert.assertSame(createdOrderedProduct, this.orderedProduct);
}

@Test
public void b_read()
{
    OrderedProduct savedOrderedProduct = getSavedOrderedProduct();
    System.out.println("readOrderedProduct, productId = " + savedOrderedProduct.getId());
    OrderedProduct read = this.repository.read(savedOrderedProduct.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedOrderedProduct, read);
e_getAll();
}

@Test
public void c_update()
{
    String newProductDesc = "new product desc test";
    OrderedProduct orderedProduct = new OrderedProduct.Builder().copy(getSavedOrderedProduct()).productDesc(newProductDesc).build();
    System.out.println("about to update = " + orderedProduct);
    OrderedProduct updatedOrderedProduct = this.repository.update(orderedProduct);
    System.out.println("updated product desc = " + updatedOrderedProduct);
    Assert.assertSame(newProductDesc, updatedOrderedProduct.getId());
    e_getAll();
}

@Test
public void d_delete()
{
    orderedProduct savedOrderedProduct = getSavedOrderedProduct();
    this.repository.delete(savedOrderedProduct.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<OrderedProduct> all = this.repository.getAll();
    System.out.println("all = " + all);
}
=======

    private OrderedProductRepositoryImpl repository;
    private OrderedProduct orderedPd;

    private OrderedProduct getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = OrderedProductRepositoryImpl.getRepository();
        this.orderedPd = OrderedProductFactory.buildOrderedProduct("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        OrderedProduct created = this.repository.create(this.orderedPd);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.orderedPd);
    }

    @Test
    public void c_update() {
        String newOrderedProductName = "Application Development Theory 3";
        OrderedProduct updated = new OrderedProduct.Builder().copy(getSaved()).orderedPdName(newOrderedProductName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newOrderedProductName, updated.getOrderedProductName());
    }

    @Test
    public void e_delete() {
        OrderedProduct saved = getSaved();
        this.repository.delete(saved.getOrderedProductId());
        d_getAll();
    }

    @Test
    public void b_read() {
        OrderedProduct saved = getSaved();
        OrderedProduct read = this.repository.read(saved.getOrderedProductId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<OrderedProduct> orderedPds = this.repository.getAll();
        System.out.println("In getall, all = " + orderedPds);
    }
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}