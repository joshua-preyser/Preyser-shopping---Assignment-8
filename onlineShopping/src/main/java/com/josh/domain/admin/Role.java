package com.josh.domain.admin;


public class Role
{
    private int roleId;
    private String roleTitle;
    private String roleDesc;

    private Role()
    {
    }

    public Role(Builder builder) {
        this.roleId = builder.roleId;
        this.roleTitle = builder.roleTitle;
        this.roleDesc = builder.roleDesc;
    }

    public int getRoleId()
    {
        return roleId;
    }

    public String getRoleTitle()
    {
        return roleTitle;
    }

    public String getRoleDesc()
    {
        return roleDesc;
    }

    public static class Builder
    {
    private int roleId;
    private String roleTitle;
    private String roleDesc;

        public Builder roleId(int roleId)
        {
        this.roleId = roleId;
        return this;
        }

        public Builder roleTitle(String roleTitle)
        {
        this.roleTitle = roleTitle;
        return this;
        }

        public Builder roleDesc(String roleDesc)
        {
        this.roleDesc = roleDesc;
        return this;
        }

        public Builder copy(Role role)
        {
        this.roleId = role.roleId;
        this.roleTitle = role.roleTitle;
        this.roleDesc = role.roleDesc;
        return this;
        }

        public Role build()
        {
        return new Role(this);
        }

    }

    @Override
    public String toString() {
        return "Role [roleDesc=" + roleDesc + ", roleId=" + roleId + ", roleTitle=" + roleTitle + "]";
    }

}