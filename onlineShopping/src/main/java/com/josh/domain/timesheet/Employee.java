package com.josh.domain.employee;

public class Employee
{
    private int id;
    private String name, email, address, role;
    private Employee()
    {

    }
    public Employee(Builder builder)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.role = role;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getAddress()
    {
        return address;
    }
    public String getRole()
    {
        return role;
    }
    public static class Builder
    {
        private int id;
        private String name, email, address, role;
    public Builder id(int id)
    {
this.id = id;
return this;
    }
    public Builder name(String name)
    {
        this.name = name;
        return this;
    }
    public Builder email(String email)
    {
        this.email = email;
        return this;
    }
    public Builder address(String address)
    {
        this.address = address;
        return this;
    }
    public builder role(String role)
    {
        this.role = role;
        return this;
    }
    public Builder copy(Employee employee)
    {
        this.id = employee.id;
        this.name = employee.name;
        this.email = employee.email;
        this.address = employee.address;
        this.role = employee.role;
        return this;
    }
    public Employee build()
    {
        return new Employee(this);
    }

        @Override
        public String toString() {
            return "Builder [address=" + address + ", email=" + email + ", id=" + id + ", name=" + name + ", role="
                    + role + "]";
        }
    
    }
}