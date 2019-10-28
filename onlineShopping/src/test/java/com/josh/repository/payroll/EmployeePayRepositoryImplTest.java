package com.josh.repository.payroll;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.factory.payroll.EmployeePayFactory;
import com.josh.repository.payroll.impl.EmployeePayRepositoryImpl;

import org.junit.Before;

public class EmployeePayRepositoryImplTest
{
private EmployeePayRepository repository;
private EmployeePay employeePay;
private EmployeePay getSavedEmployeePay()
{
    Set<EmployeePay> savedEmployeePay = this.repository.getAll();
    return savedEmployeePay.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = EmployeePayRepositoryImpl.getRepository();
    this.employeePay = EmployeePayFactory.buildEmployeePay(id, paid, total, desc)
}

@Test
public void a_create()
{
    EmployeePay createdEmployeePay = this.repository.create(this.employeePay);
    System.out.println("in create, createdEmployeePay = " + createdEmployeePay);
    e_getAll();
    Assert.assertSame(createdEmployeePay, this.employeePay);
}

@Test
public void b_read()
{
    EmployeePay savedEmployeePay = getSavedEmployeePay();
    System.out.println("readEmployeePay, employeePayId = " + savedEmployeePay.getId());
    EmployeePay read = this.repository.read(savedEmployeePay.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedEmployeePay, read);
e_getAll();
}

@Test
public void c_update()
{
    String newDesc = "new employeePay desc test";
    EmployeePay employeePay = new EmployeePay.Builder().copy(getSavedEmployeePay()).desc(newDesc).build();
    System.out.println("about to update = " + employeePay);
    EmployeePay updatedEmployeePay = this.repository.update(employeePay);
    System.out.println("updated employeePay = " + updatedEmployeePay);
    Assert.assertSame(newDesc, updatedEmployeePay.getDesc());
    e_getAll();
}

@Test
public void d_delete()
{
    EmployeePay savedEmployeePay = getSavedEmployeePay();
    this.repository.delete(savedEmployeePay.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<EmployeePay> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}