package com.josh.factory.admin;

import com.josh.domain.admin.Account;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class AccountFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildAccount()
    {
        Account account = AccountFactory.buildAccount("01", "capetown", true, new Date(), new Date());
        Assert.assertNotNull(account.getId());
        Assert.assertNotNull(account.getAddress());
        Assert.assertNotNull(account.getIs_closed());
        Assert.assertNotNull(account.getOpen());
        Assert.assertNotNull(account.getClosed());
        Assert.assertNotNull(account);
    }
}