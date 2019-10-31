package com.josh.service.payroll;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.factory.payroll.UserRateFactory;
import com.josh.service.payroll.impl.UserRateServiceImpl;

import org.junit.Before;

public class UserRateServiceImplTest
{
private UserRateService service;
private UserRate userRate;
private UserRate getSavedUserRate()
{
    Set<UserRate> savedUserRate = this.service.getAll();
    return savedUserRate.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = UserRateServiceImpl.getService();
    this.userRate = UserRateFactory.buildUserRate(rateCode, userRate, rateId)
}

@Test
public void a_create()
{
    UserRate createdUserRate = this.service.create(this.userRate);
    System.out.println("in create, createdUserRate = " + createdUserRate);
    e_getAll();
    Assert.assertSame(createdUserRate, this.userRate);
}

@Test
public void b_read()
{
    UserRate savedUserRate = getSavedUserRate();
    System.out.println("readUserRate, rateCode = " + savedUserRate.getRateCode());
    UserRate read = this.service.read(savedUserRate.getRateCode());
    System.out.println("read = " + read);
    Assert.assertEquals(savedUserRate, read);
e_getAll();
}

@Test
public void c_update()
{
    String newRateCode = "new rate code test";
    UserRate userRate = new UserRate.Builder().copy(getSavedUserRate()).rateCode(newRateCode).build();
    System.out.println("about to update = " + userRate);
    UserRate updatedUserRate = this.service.update(userRate);
    System.out.println("updated user rate = " + updatedUserRate);
    Assert.assertSame(newRateCode, updatedUserRate.getRateCode());
    e_getAll();
}

@Test
public void d_delete()
{
    UserRate savedUserRate = getSavedUserRate();
    this.service.delete(savedUserRate.getRateCode());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<UserRate> all = this.service.getAll();
    System.out.println("all = " + all);
}
}