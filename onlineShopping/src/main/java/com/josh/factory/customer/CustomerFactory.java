package com.josh.factory.customer;
import com.josh.domain.customer.Customer;

public class CustomerFactory
{
    public static Customer buildCustomer(String id, String address, String phone, String email)
    {
        return new Customer.Builder().id(id).address(address).phone(phone).email(email).build();
    }
}