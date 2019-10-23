package com.josh.domain.customer;

import java.util.Date;

public class Delivery
{
    private int deliveryId;
    private String orderId;
    private Date deliveryDate;
    private string address;

    private Delivery()
    {
    }

    public Delivery(Builder builder) {
        this.deliveryId = builder.deliveryId;
        this.orderId = builder.orderId;
        this.deliveryDate = builder.deliveryDate;
        this.address = builder.address;
    }

    public int getDeliveryId()
    {
        return deliveryId;
    }

    public String getOrderId()
    {
        return orderId;
    }
    public Date getDeliveryDate()
    {
        return deliveryDate;
    }
    public String getAddress()
    {
        return address;
    }

    public static class Builder
    {
    private int deliveryId;
    private String orderId;
    private Date deliveryDate;
    private String address;

        public Builder deliveryId(int deliveryId)
        {
        this.deliveryId = deliveryId;
        return this;
        }
        public Builder orderId(String orderId)
        {
        this.orderId = orderId;
        return this;
        }
        public Builder deliveryDate(Date deliveryDate)
        {
        this.deliveryDate = deliveryDate;
        return this;
        }
        public Builder address(String address)
        {
        this.address = address;
        return this;
        }

        public Builder copy(Delivery delivery)
        {
        this.deliveryId = delivery.deliveryId;
        this.orderId = delivery.orderId;
        this.deliveryDate = delivery.deliveryDate;
        this.address = delivery.address;
        return this;
        }

        public Delivery build()
        {
        return new Delivery(this);
        }

    }

    @Override
    public String toString() {
        return "Delivery [address=" + address + ", deliveryDate=" + deliveryDate + ", deliveryId=" + deliveryId + ", orderId=" + orderId + "]";
    }


}