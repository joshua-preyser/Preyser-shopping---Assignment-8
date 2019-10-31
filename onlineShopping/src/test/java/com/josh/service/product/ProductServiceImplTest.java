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
private ProductService service;
private Product product;
private Product getSavedProduct()
{
    Set<Product> savedProduct = this.service.getAll();
    return savedProduct.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = ProductServiceImpl.getService();
    this.product = ProductFactory.buildProduct(id, name, supplier)
}

@Test
public void a_create()
{
    Product createdProduct = this.service.create(this.product);
    System.out.println("in create, createdProduct = " + createdProduct);
    e_getAll();
    Assert.assertSame(createdProduct, this.product);
}

@Test
public void b_read()
{
    Product savedProduct = getSavedProduct();
    System.out.println("readProduct, productId = " + savedProduct.getId());
    Product read = this.service.read(savedProduct.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedProduct, read);
e_getAll();
}

@Test
public void c_update()
{
    String newSupplier = "new supplier test";
    Product product = new Product.Builder().copy(getSavedProduct()).supplier(newSupplier).build();
    System.out.println("about to update = " + orderedProduct);
    Product updatedProduct = this.service.update(product);
    System.out.println("updated supplier = " + updatedProduct);
    Assert.assertSame(newSupplier, updatedProduct.getId());
    e_getAll();
}

@Test
public void d_delete()
{
    product savedProduct = getSavedProduct();
    this.service.delete(savedProduct.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Product> all = this.service.getAll();
    System.out.println("all = " + all);
}
}