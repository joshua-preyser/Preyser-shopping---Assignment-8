package com.josh.factory.payroll;

import com.josh.domain.payroll.Payment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PaymentFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildPayment()
    {
        Payment payment = PaymentFactory.buildPayment(1., 1, new Date(), 50000.00);
        Assert.assertNotNull(payment.getPaymentId());
        Assert.assertNotNull(payment.getOrderId());
        Assert.assertNotNull(payment.getPaymentDate());
        Assert.assertNotNull(payment.getPaymentAmount());
        Assert.assertNotNull(payment);
    }
}