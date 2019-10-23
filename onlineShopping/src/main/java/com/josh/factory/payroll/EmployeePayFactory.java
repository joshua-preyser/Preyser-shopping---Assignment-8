package com.josh.factory.payroll;

import com.josh.domain.payroll.EmployeePay;

public class EmployeePayFactory
{
    public static EmployeePay buildEmployeePay(String id, Boolean paid, String total, String desc)
    {
return new EmployeePay.Builder().id(id).paid(paid).total(total).desc(desc).build();
    }
}