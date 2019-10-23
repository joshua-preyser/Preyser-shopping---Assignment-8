package com.josh.domain.payroll;

import java.util.Date;

public class Payment
{
    private int paymentId;
    private int orderId;
    private Date paymentDate;
    private double paymentAmount;

    private Payment() {
    }

    public Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.orderId = builder.orderId;
        this.paymentDate = builder.paymentDate;
        this.paymentAmount = builder.paymentAmount;
    }

    public int getPaymentId()
    {
        return paymentId;
    }


    public int getOrderId()
    {
        return orderId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public static class Builder
    {
    private int paymentId;
    private int orderId;
    private Date paymentDate;
    private double paymentAmount;

        public Builder paymentId(int paymentId)
        {
        this.paymentId = paymentId;
        return this;
        }
        public Builder orderId(int orderId)
        {
        this.orderId = orderId;
        return this;
        }

        public Builder paymentDate(Date paymentDate)
        {
        this.paymentDate = paymentDate;
        return this;
        }

        public Builder paymentAmount(double paymentAmount)
        {
        this.paymentAmount = paymentAmount;
        return this;
        }

        public Builder copy(Payment payment) {
this.paymentId = payment.paymentId;
        this.orderId = payment.orderId;
        this.paymentDate = payment.paymentDate;
        this.paymentAmount = payment.paymentAmount;
        return this;
        }

        public Payment build()
        {
        return new Payment(this);
        }

    }

    @Override
    public String toString() {
        return "Payment [orderId=" + orderId + ", paymentAmount=" + paymentAmount + ", paymentDate=" + paymentDate
                + ", paymentId=" + paymentId + "]";
    }



}