package com.josh.factory.product;

import com.josh.domain.product.Order;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class OrderFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildOrder()
    {
        Order order = OrderFactory.buildOrder(1, 1, new Date());
        Assert.assertNotNull(order.getOrderId());
        Assert.assertNotNull(order.getCustomerId());
        Assert.assertNotNull(order.getDateAdded());
        Assert.assertNotNull(order);
    }
}