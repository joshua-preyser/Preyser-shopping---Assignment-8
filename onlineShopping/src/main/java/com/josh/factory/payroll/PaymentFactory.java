package com.josh.factory.payroll;

import com.josh.domain.payroll.Payment;

public class PaymentFactory
{
    public static Payment buildPayment(String id, Boolean paid, String total, String desc)
    {
return new Payment.Builder().id(id).paid(paid).total(total).desc(desc).build();
    }
}