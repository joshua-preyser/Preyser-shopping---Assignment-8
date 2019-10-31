package com.josh.service.payroll;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.payroll.Payment;
import com.josh.factory.payroll.PaymentFactory;
import com.josh.service.payroll.impl.PaymentServiceImpl;

import org.junit.Before;

public class PaymentServiceImplTest
{
private PaymentService service;
private Payment payment;
private Payment getSavedPayment()
{
    Set<Payment> savedPayment = this.service.getAll();
    return savedPayment.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = PaymentServiceImpl.getService();
    this.payment = PaymentFactory.buildPayment(paymentId, orderId, paymentDate, paymentAmount)
}

@Test
public void a_create()
{
    Payment createdPayment = this.service.create(this.payment);
    System.out.println("in create, createdPayment = " + createdPayment);
    e_getAll();
    Assert.assertSame(createdPayment, this.payment);
}

@Test
public void b_read()
{
    Payment savedPayment = getSavedPayment();
    System.out.println("readPayment, paymentId = " + savedPayment.getId());
    Payment read = this.service.read(savedPayment.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedPayment, read);
e_getAll();
}

@Test
public void c_update()
{
    String newPaymentDate = "new payment date test";
    Payment payment = new Payment.Builder().copy(getSavedPayment()).paymentDate(newPaymentDate).build();
    System.out.println("about to update = " + payment);
    Payment updatedPayment = this.service.update(payment);
    System.out.println("updated payment = " + updatedPayment);
    Assert.assertSame(newPaymentDate, updatedPayment.getPaymentDate());
    e_getAll();
}

@Test
public void d_delete()
{
    Payment savedPayment = getSavedPayment();
    this.service.delete(savedPayment.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Payment> all = this.service.getAll();
    System.out.println("all = " + all);
}
}