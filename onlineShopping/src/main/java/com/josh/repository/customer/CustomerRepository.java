package com.josh.repository.customer;

import java.util.Set;

import com.josh.domain.customer.Customer;
import com.josh.repository.IRepository;

public interface CustomerRepository extends IRepository<Customer, String>
{
Set<Customer> getAll();
}