package com.josh.factory.payroll;

import java.util.Date;

import com.josh.domain.payroll.Payment;

public class PaymentFactory
{
    public static Payment buildPayment(int paymentId, int orderId, Date paymentDate, double paymentAmount)
    {
return new Payment.Builder().paymentId(paymentId).orderId(orderId).paymentDate(paymentDate).paymentAmount(paymentAmount).build();
    }
}