package com.josh.factory.payroll;

import com.josh.domain.payroll.Rate;

public class RateFactory
{
    public static Rate buildRate(int rateId, String rateTitle, String rateDesc)
    {
return new Rate.Builder().rateId(rateId).rateTitle(rateTitle).rateDesc(rateDesc).build();
    }
}