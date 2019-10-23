package com.josh.factory.product;

import java.util.Date;

import com.josh.domain.product.Order;

public class OrderFactory
{
    public static Order buildOrder(int orderId, int customerId, Date dateAdded)
    {
return new Order.Builder().orderId(orderId).customerId(customerId).dateAdded(dateAdded).build();
    }
}