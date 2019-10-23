package com.josh.factory.customer;

import java.util.Date;

import com.josh.domain.customer.Delivery;

public class DeliveryFactory
{
    public static Delivery buildDelivery(int deliveryId, String orderId, Date DeliveryDate, String address)
    {
return new Delivery.Builder().deliveryId(deliveryId).orderId(orderId).deliveryDate(deliveryDate).address(address).build();
    }
}