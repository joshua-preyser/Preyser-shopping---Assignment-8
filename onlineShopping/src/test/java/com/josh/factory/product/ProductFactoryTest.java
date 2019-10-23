package com.josh.factory.product;

import com.josh.domain.product.Product;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ProductFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildProduct()
    {
        Product product = ProductFactory.buildProduct(id, name, supplier);
        Assert.assertNotNull(product.getId());
        Assert.assertNotNull(product.getName());
        Assert.assertNotNull(product.getSupplier());
        Assert.assertNotNull(product);
    }
}