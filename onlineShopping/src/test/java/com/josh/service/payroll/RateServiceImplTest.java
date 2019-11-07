package com.josh.service.payroll;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.factory.payroll.RateFactory;
import com.josh.service.payroll.impl.RateServiceImpl;

import org.junit.Before;

public class RateServiceImplTest
{
    private RateRepositoryImpl repository;
    private Rate rate;

    private Rate getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RateRepositoryImpl.getRepository();
        this.rate = RateFactory.buildRate("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Rate created = this.repository.create(this.rate);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.rate);
    }

    @Test
    public void c_update() {
        String newRateName = "Application Development Theory 3";
        Rate updated = new Rate.Builder().copy(getSaved()).rateName(newRateName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newRateName, updated.getRateName());
    }

    @Test
    public void e_delete() {
        Rate saved = getSaved();
        this.repository.delete(saved.getRateId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Rate saved = getSaved();
        Rate read = this.repository.read(saved.getRateId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Rate> rates = this.repository.getAll();
        System.out.println("In getall, all = " + rates);
    }
}