package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Employee;

public class EmployeeFactory
{
    public static Employee buildEmployee(int id, String name, String address, String role, String email)
    {
        return new Employee.Builder().id(id).name(name).email(email).address(address).role(role).build();
    }
}