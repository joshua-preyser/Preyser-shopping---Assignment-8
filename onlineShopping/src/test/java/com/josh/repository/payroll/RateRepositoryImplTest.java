package com.josh.repository.payroll;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.factory.payroll.RateFactory;
import com.josh.repository.payroll.impl.RateRepositoryImpl;

import org.junit.Before;

public class RateRepositoryImplTest
{
private RateRepository repository;
private Rate rate;
private Rate getSavedRate()
{
    Set<Rate> savedRate = this.repository.getAll();
    return savedRate.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = RateRepositoryImpl.getRepository();
    this.rate = RateFactory.buildRate(rateId, rateTitle, rateDesc)
}

@Test
public void a_create()
{
    Rate createdRate = this.repository.create(this.rate);
    System.out.println("in create, createdRate = " + createdRate);
    e_getAll();
    Assert.assertSame(createdRate, this.rate);
}

@Test
public void b_read()
{
    Rate savedRate = getSavedRate();
    System.out.println("readRate, rateId = " + savedRate.getId());
    Rate read = this.repository.read(savedRate.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedRate, read);
e_getAll();
}

@Test
public void c_update()
{
    String newRateDesc = "new rate desc test";
    Rate rate = new Rate.Builder().copy(getSavedRate()).rateDesc(newRateDesc).build();
    System.out.println("about to update = " + rate);
    Rate updatedRate = this.repository.update(rate);
    System.out.println("updated rate = " + updatedRate);
    Assert.assertSame(newRateDesc, updatedRate.getRateDesc());
    e_getAll();
}

@Test
public void d_delete()
{
    Rate savedRate = getSavedRate();
    this.repository.delete(savedRate.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Rate> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}