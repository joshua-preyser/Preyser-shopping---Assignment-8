package com.josh.domain.admin;


import java.util.Date;

public class User
{
    private int userId;
    private int userRoleId;
    private String userName;
    private String userEmail;
    private Date userDob;
    private String userAddress;

    private User()
    {
    }

    public User(Builder builder) {
        this.userId = builder.userId;
        this.userRoleId = builder.userRoleId;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.userDob = builder.userDob;
        this.userAddress = builder.userAddress;
    }

    public int getUserId()
    {
        return userId;
    }

    public int getUserRoleId()
    {
        return userRoleId;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }
    public Date getUserDob()
    {
        return userDob;
    }
    public String getUserAddress()
    {
        return userAddress;
    }

    public static class Builder
    {
    private int userId;
    private int userRoleId;
    private String userName;
    private String userEmail;
    private Date userDob;
    private String userAddress;

        public Builder userId(int userId)
        {
        this.userId = userId;
        return this;
    }

        public Builder userRoleId(int userRoleId)
        {
        this.userRoleId = userRoleId;
        return this;
        }

        public Builder userName(String userName)
        {
        this.userName = userName;
        return this;
        }

        public Builder userEmail(String userEmail)
        {
        this.userEmail = userEmail;
        return this;
        }
        public Builder userDob(Date userDob)
        {
        this.userDob = userDob;
        return this;
        }
        public Builder userAddress(String userAddress)
        {
        this.userAddress = userAddress;
        return this;
        }

        public Builder copy(User user)
        {
this.userId = user.userId;
        this.userRoleId = user.userRoleId;
        this.userName = user.userName;
        this.userEmail = user.userEmail;
        this.userDob = user.userDob;
        this.userAddress = user.userAddress;
        return this;
        }

        public User build()
        {
        return new User(this);
        }

    }
@Override
    public String toString()
    {
        return "User [userAddress=" + userAddress + ", userDob=" + userDob + ", userEmail=" + userEmail + ", userId=" + userId + ", userName=" + userName + ", userRoleId=" + userRoleId + "]";
    }
    

}