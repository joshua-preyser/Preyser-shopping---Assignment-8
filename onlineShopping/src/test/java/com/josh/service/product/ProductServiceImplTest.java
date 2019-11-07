package com.josh.service.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.Product;
import com.josh.factory.product.ProductFactory;
import com.josh.service.product.impl.ProductServiceImpl;

import org.junit.Before;

public class ProductServiceImplTest
{

    private ProductRepositoryImpl repository;
    private Product product;

    private Product getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ProductRepositoryImpl.getRepository();
        this.product = ProductFactory.buildProduct("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Product created = this.repository.create(this.product);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.product);
    }

    @Test
    public void c_update() {
        String newProductName = "Application Development Theory 3";
        Product updated = new Product.Builder().copy(getSaved()).productName(newProductName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newProductName, updated.getProductName());
    }

    @Test
    public void e_delete() {
        Product saved = getSaved();
        this.repository.delete(saved.getProductId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Product saved = getSaved();
        Product read = this.repository.read(saved.getProductId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Product> products = this.repository.getAll();
        System.out.println("In getall, all = " + products);
    }
}