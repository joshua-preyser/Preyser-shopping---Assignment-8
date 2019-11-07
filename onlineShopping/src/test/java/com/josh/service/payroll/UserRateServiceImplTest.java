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
}