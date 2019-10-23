package com.josh.domain.product;
import java.util.Date;


public class Order
{
    private int orderId;
    private int customerId;
    private Date dateAdded;

    private Order()
    {
    }

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.dateAdded = builder.dateAdded;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public int getCustomerId()
    {
        return customerId;
    }
    public Date getDateAdded()
    {
        return dateAdded;
    }

    public static class Builder
    {
    private int orderId;
    private int customerId;
    private Date dateAdded;

        public Builder orderId(int orderId)
        {
        this.orderId = orderId;
        return this;
        }
        public Builder customerId(int customerId)
        {
        this.customerId = customerId;
        return this;
        }
        public Builder dateAdded(Date dateAdded)
        {
        this.dateAdded = dateAdded;
        return this;
        }

        public Builder copy(Order order)
        {
        this.orderId = order.orderId;
        this.customerId = order.customerId;
        this.dateAdded = order.dateAdded;
        return this;
        }

        public Order build()
        {
        return new Order(this);
        }

    }

    @Override
    public String toString() {
        return "Order [customerId=" + customerId + ", dateAdded=" + dateAdded + ", orderId=" + orderId + "]";
    }



}