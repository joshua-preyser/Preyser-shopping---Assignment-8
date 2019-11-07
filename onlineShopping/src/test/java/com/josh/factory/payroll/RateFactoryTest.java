package com.josh.factory.payroll;

import com.josh.domain.payroll.Rate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class RateFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildRate()
    {
        Rate rate = RateFactory.buildRate(1, "charge per hour", "hours worked");
        Assert.assertNotNull(rate.getRateId());
        Assert.assertNotNull(rate.getRateTitle());
        Assert.assertNotNull(rate.getRateDesc());
        Assert.assertNotNull(rate);
    }
}