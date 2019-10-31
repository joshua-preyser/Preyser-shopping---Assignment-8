package com.josh.service.customer;

import java.util.Set;

import com.josh.domain.customer.Customer;
import com.josh.service.IService;

public interface CustomerService extends IService<Customer, String>
{
Set<Customer> getAll();
}