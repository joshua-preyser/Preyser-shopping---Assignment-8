package com.josh.domain.admin;


public class Permition
{
    private int permId;
    private int permRoleId;
    private String permTitle;
    private String permDesc;

    private Permition()
    {
    }

    public Permition(Builder builder) {
        this.permId = builder.permId;
        this.permRoleId = builder.permRoleId;
        this.permTitle = builder.permTitle;
        this.permDesc = builder.permDesc;
    }

    public int getPermId()
    {
        return permId;
    }

    public int getPermRoleId()
    {
        return permRoleId;
    }

    public String getPermTitle()
    {
        return permTitle;
    }

    public String getPermDesc()
    {
        return permDesc;
    }

    public static class Builder
    {
    private int permId;
    private int permRoleId;
    private String permTitle;
    private String permDesc;

        public Builder permId(int permId)
        {
        this.permId = permId;
        return this;
    }

        public Builder permRoleId(int permRoleId)
        {
        this.permRoleId = permRoleId;
        return this;
        }

        public Builder permTitle(String permTitle)
        {
        this.permTitle = permTitle;
        return this;
        }

        public Builder permDesc(String permDesc)
        {
        this.permDesc = permDesc;
        return this;
        }

        public Builder copy(Permition permition)
        {
this.permId = permition.permId;
        this.permRoleId = permition.permRoleId;
        this.permTitle = permition.permTitle;
        this.permDesc = permition.permDesc;
        return this;
        }

        public Permition build()
        {
        return new Permition(this);
        }

    }

    @Override
    public String toString()
    {
        return "Permition [permDesc=" + permDesc + ", permId=" + permId + ", permRoleId=" + permRoleId + ", permTitle="
                + permTitle + "]";
    }
    
}