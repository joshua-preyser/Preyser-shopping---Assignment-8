package com.josh.factory.payroll;

import com.josh.domain.payroll.UserRate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class UserRateFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildUserRate()
    {
        UserRate userRate = UserRateFactory.buildUserRate(rateCode, userRate, rateId);
        Assert.assertNotNull(userRate.getRateCode());
        Assert.assertNotNull(userRate.getUserRate());
        Assert.assertNotNull(userRate.getRateId());
        Assert.assertNotNull(userRate);
    }
}