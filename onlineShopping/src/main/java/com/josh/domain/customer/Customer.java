package com.josh.domain.customer;

public class Customer{
    private String id, address, phone, email;
    private Customer()
    {

    }
    public Customer(Builder builder)
    {
        this.id = builder.id;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }
    public String getId()
    {
        return id;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getEmail()
    {
        return email;
    }

public static class Builder
{
    private String id, address, phone, email;
public Builder id(String id)
{
    this.id = id;
    return this;
}
public Builder address(String address)
{
    this.address = address;
    return this;
}
public Builder phone(String phone)
{
    this.phone = phone;
    return this;
}
public Builder email(String email)
{
    this.email = email;
    return this;
}
public Builder copy(Customer customer)
{
    this.id = customer.id;
    this.address = customer.address;
    this.phone = customer.phone;
    this.email = customer.email;
    return this;
}
public Customer build()
{
    return new Customer(this);
}

        @Override
        public String toString() {
            return "Builder [address=" + address + ", email=" + email + ", id=" + id + ", phone=" + phone + "]";
        }

}
}