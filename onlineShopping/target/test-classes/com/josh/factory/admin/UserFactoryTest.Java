package com.josh.factory.admin;

import com.josh.domain.admin.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class UserFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildUser()
    {
        User user = UserFactory.buildUser(userId, userRoleId, userName, userEmail, userDob, userAddress);
        Assert.assertNotNull(user.getUserId());
        Assert.assertNotNull(user.getUserRoleId());
        Assert.assertNotNull(user.getUserName());
        Assert.assertNotNull(user.getUserEmail());
        Assert.assertNotNull(user.getUserDob());
        Assert.assertNotNull(user.getUserAddress());
        Assert.assertNotNull(user);
    }
}