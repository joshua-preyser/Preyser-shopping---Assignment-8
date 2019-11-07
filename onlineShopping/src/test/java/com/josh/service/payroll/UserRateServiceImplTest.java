package com.josh.repository.payroll;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.factory.payroll.UserRateFactory;
import com.josh.service.payroll.impl.UserRateServiceImpl;

import org.junit.Before;

public class UserRateServiceImplTest
{
<<<<<<< HEAD
private UserRateRepository repository;
private UserRate userRate;
private UserRate getSaved()
{
    Set<UserRate> savedUserRate = this.repository.getAll();
    return savedUserRate.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = UserRateRepositoryImpl.getRepository();
    this.userRate = UserRateFactory.buildUserRate(rateCode, userRate, rateId)
}

@Test
public void a_create()
{
    UserRate createdUserRate = this.repository.create(this.userRate);
    System.out.println("in create, createdUserRate = " + createdUserRate);
    e_getAll();
    Assert.assertSame(createdUserRate, this.userRate);
}

@Test
public void b_read()
{
    UserRate savedUserRate = getSavedUserRate();
    System.out.println("readUserRate, rateCode = " + savedUserRate.getRateCode());
    UserRate read = this.repository.read(savedUserRate.getRateCode());
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
    UserRate updatedUserRate = this.repository.update(userRate);
    System.out.println("updated user rate = " + updatedUserRate);
    Assert.assertSame(newRateCode, updatedUserRate.getRateCode());
    e_getAll();
}

@Test
public void d_delete()
{
    UserRate savedUserRate = getSavedUserRate();
    this.repository.delete(savedUserRate.getRateCode());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<UserRate> all = this.repository.getAll();
    System.out.println("all = " + all);
}
=======

    private UserRateRepositoryImpl repository;
    private UserRate rate;

    private UserRate getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UserRateRepositoryImpl.getRepository();
        this.rate = UserRateFactory.buildUserRate("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        UserRate created = this.repository.create(this.rate);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.rate);
    }

    @Test
    public void c_update() {
        String newUserRateName = "Application Development Theory 3";
        UserRate updated = new UserRate.Builder().copy(getSaved()).rateName(newUserRateName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newUserRateName, updated.getUserRateName());
    }

    @Test
    public void e_delete() {
        UserRate saved = getSaved();
        this.repository.delete(saved.getUserRateId());
        d_getAll();
    }

    @Test
    public void b_read() {
        UserRate saved = getSaved();
        UserRate read = this.repository.read(saved.getUserRateId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<UserRate> rates = this.repository.getAll();
        System.out.println("In getall, all = " + rates);
    }
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}