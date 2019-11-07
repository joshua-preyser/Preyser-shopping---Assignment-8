package com.josh.factory.customer;

import com.josh.domain.customer.Cart;
import com.josh.factory.admin.UserFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CartFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildCart()
    {
        Cart cart = CartFactory.buildCart(1, 1, 1);
        Assert.assertNotNull(cart.getCartId());
        Assert.assertNotNull(cart.getProductId());
        Assert.assertNotNull(cart.getDateAdded());
        Assert.assertNotNull(cart);
    }
}