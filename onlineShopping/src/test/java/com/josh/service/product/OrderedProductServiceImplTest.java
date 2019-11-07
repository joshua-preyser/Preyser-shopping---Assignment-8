package com.josh.service.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.factory.product.OrderedProductFactory;
import com.josh.service.product.impl.OrderedProductServiceImpl;

import org.junit.Before;

public class OrderedProductServiceImplTest
{

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
}