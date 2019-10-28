package com.josh.repository.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.factory.product.OrderedProductFactory;
import com.josh.repository.product.impl.OrderedProductRepositoryImpl;

import org.junit.Before;

public class OrderedProductRepositoryImplTest
{
private OrderedProductRepository repository;
private OrderedProduct orderedProduct;
private OrderedProduct getSavedOrderedProduct()
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
}