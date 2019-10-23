package com.josh.domain.payroll;

public class Rate
{
    private int rateId;
    private String rateTitle;
    private String rateDesc;

    private Rate()
    {
    }

    public Rate(Builder builder)
    {
        this.rateId = builder.rateId;
        this.rateTitle = builder.rateTitle;
        this.rateDesc = builder.rateDesc;
    }

    public int getRateId()
    {
        return rateId;
    }


    public String getRateTitle()
    {
        return rateTitle;
    }

    public String getRateDesc()
    {
        return rateDesc;
    }

    public static class Builder
    {
    private int rateId;
    private String rateTitle;
    private String rateDesc;

        public Builder rateId(int rateId)
        {
        this.rateId = rateId;
        return this;
        }
        public Builder rateTitle(String rateTitle)
        {
        this.rateTitle = rateTitle;
        return this;
        }

        public Builder rateDesc(String rateDesc)
        {
        this.rateDesc = rateDesc;
        return this;
        }

        public Builder copy(Rate rate)
        {
        this.rateId = rate.rateId;
        this.rateTitle = rate.rateTitle;
        this.rateDesc = rate.rateDesc;
        return this;
        }

        public Rate build()
        {
        return new Rate(this);
        }

    }

    @Override
    public String toString() {
        return "Rate [rateDesc=" + rateDesc + ", rateId=" + rateId + ", rateTitle=" + rateTitle + "]";
    }




}