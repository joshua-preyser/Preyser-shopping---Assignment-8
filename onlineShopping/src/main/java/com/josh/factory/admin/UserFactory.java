package com.josh.factory.admin;

import com.josh.domain.admin.User;

public class UserFactory
{
    public static User buildUser(int userId, int userRoleId, String userName, String userEmail, Date userDob, String userAddress)
    {
return new User.Builder().userId(userId).userRoleId(userRoleId).userName(userName).userEmail(userEmail).userDob(userDob).userAddress(userAddress).build();
    }
}