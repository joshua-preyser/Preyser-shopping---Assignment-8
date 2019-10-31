package com.josh.service.customer;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.customer.Customer;
import com.josh.factory.customer.CustomerFactory;
import com.josh.service.customer.impl.CustomerServiceImpl;

import org.junit.Before;

public class CustomerServiceImplTest
{
private CustomerService service;
private Customer customer;
private Customer getSavedCustomer()
{
    Set<Customer> savedCustomer = this.service.getAll();
    return savedCustomer.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = CustomerServiceImpl.getService();
    this.customer = CustomerFactory.buildCustomer(id, address, phone, email)
}

@Test
public void a_create()
{
    Customer createdCustomer = this.service.create(this.customer);
    System.out.println("in create, createdCustomer = " + createdCustomer);
    e_getAll();
    Assert.assertSame(createdCustomer, this.customer);
}

@Test
public void b_read()
{
    Customer savedCustomer = getSavedCustomer();
    System.out.println("readCustomer, customerId = " + savedCustomer.getId());
    Customer read = this.service.read(savedCustomer.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedCustomer, read);
e_getAll();
}

@Test
public void c_update()
{
    String newEmail = "new customer email test";
    Customer customer = new Customer.Builder().copy(getSavedCustomer()).email(newEmail).build();
    System.out.println("about to update = " + customer);
    Customer updatedCustomer = this.service.update(customer);
    System.out.println("updated customer = " + updatedCustomer);
    Assert.assertSame(newEmail, updatedCustomer.getEmail());
    e_getAll();
}

@Test
public void d_delete()
{
    Customer savedCustomer = getSavedCustomer();
    this.service.delete(savedCustomer.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Customer> all = this.service.getAll();
    System.out.println("all = " + all);
}
}