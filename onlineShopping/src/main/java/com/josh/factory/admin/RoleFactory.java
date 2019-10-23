package com.josh.factory.admin;

import com.josh.domain.admin.Inventory;
import com.josh.domain.admin.Role;

public class RoleFactory
{
    public static Role buildRole(int roleId, String roleTitle, String roleDesc)
    {
return new Role.Builder().roleId(roleId).roleTitle(roleTitle).roleDesc(roleDesc).build();
    }
}