package com.josh.factory.admin;

import com.josh.domain.admin.Permition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PermitionFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildPermition()
    {
        Permition permition = PermitionFactory.buildPermition(1, 1, "admin", "administrator");
        Assert.assertNotNull(permition.getPermId());
        Assert.assertNotNull(permition.getPermRoleId());
        Assert.assertNotNull(permition.getPermtitle());
        Assert.assertNotNull(permition.getPermDesc());
        Assert.assertNotNull(permition);
    }
}