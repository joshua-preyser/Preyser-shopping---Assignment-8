package com.josh.factory.admin;

import com.josh.domain.admin.Role;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class RoleFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildRole()
    {
        Role role = RoleFactory.buildRole(1, "manager", "business manager");
        Assert.assertNotNull(role.getRoleId());
        Assert.assertNotNull(role.getRoleTitle());
        Assert.assertNotNull(role.getRoleDesc());
        Assert.assertNotNull(role);
    }
}