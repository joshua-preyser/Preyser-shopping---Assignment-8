package com.josh.service.customer.impl;

import java.util.HashSet;
import java.util.Set;
import com.josh.repository.customer.Customer;
import com.josh.repository.customer.impl.CustomerRepositoryImpl;
import com.josh.domain.customer.Customer;
import com.josh.service.customer.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    private static CustomerServiceImpl service = null;
    private CustomerRepository repository;

    private CustomerServiceImpl() {
        this.repository = CustomerRepositoryImpl.getRepository();
    }

    public static CustomerServiceImpl getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Customer create(Customer customer) {
        return this.repository.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.repository.update(customer);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Course read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }
}
