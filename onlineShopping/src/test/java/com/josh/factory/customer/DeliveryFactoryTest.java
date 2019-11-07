package com.josh.factory.customer;

import com.josh.domain.customer.Delivery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class DeliveryFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildDelivery()
    {
        Delivery delivery = DeliveryFactory.buildDelivery(1, "01, new Date(), "40, Constantia Main Road, Constantia");
        Assert.assertNotNull(delivery.getDeliveryId());
        Assert.assertNotNull(delivery.getorderId());
        Assert.assertNotNull(delivery.getDeliveryDate());
        Assert.assertNotNull(delivery.getAddress());
        Assert.assertNotNull(delivery);
    }
}