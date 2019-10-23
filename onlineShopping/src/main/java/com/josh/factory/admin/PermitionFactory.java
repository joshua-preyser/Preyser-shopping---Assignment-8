package com.josh.factory.admin;

import com.josh.domain.admin.Permition;

public class PermitionFactory
{
    public static Permition buildPermition(int permId, int permRoleId, String permTitle, String permDesc)
    {
return new Permition.Builder().permId(permId).permRoleId(permRoleId).permTtle(permTitle).permDesc(permDesc).build();
    }
}