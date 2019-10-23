package com.josh.factory.product;

import com.josh.domain.product.OrderedProduct;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class OrderedProductFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildOrderedProduct()
    {
        OrderedProduct orderedProduct = OrderedProductFactory.buildOrderedProduct(productId, productName, productDesc);
        Assert.assertNotNull(orderedProduct.getProductId());
        Assert.assertNotNull(orderedProduct.getproductName());
        Assert.assertNotNull(orderedProduct.getProductDesc());
        Assert.assertNotNull(orderedProduct);
    }
}