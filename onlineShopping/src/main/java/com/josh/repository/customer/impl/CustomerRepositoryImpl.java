package com.josh.repository.customer.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.customer.Customer;
import com.josh.repository.customer.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> c;

    private CustomerRepositoryImpl() {
        this.c = new HashSet<>();
    }

    private Customer findCustomer(String customerId) {
        return this.c.stream().filter(c -> c.getId().trim().equals(customerId)).findAny()
                .orElse(null);
    }

    public static CustomerRepositoryImpl getRepository() {
        if (repository == null)
            repository = new CustomerRepositoryImpl();
        return repository;

}

    @Override
    public Customer create(Customer customer) {
        this.c.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer toUpdate = findCustomer(customer.getId());
        if (toUpdate != null) {
            this.c.remove(toUpdate);
            return create(customer);
        }
        return null;
    }

    @Override
    public void delete(String customerId) {
        Customer customer = findCustomer(customerId);
        if (customer != null)
            this.c.remove(customer);
    }

    @Override
    public Customer read(final String customerId) {
        Customer customer = findCustomer(customerId);
        return customer;
    }

    @Override
    public Set<Customer> getAll() {

        return this.c;
    }
}