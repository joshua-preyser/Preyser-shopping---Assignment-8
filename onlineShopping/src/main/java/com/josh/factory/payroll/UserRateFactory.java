package com.josh.factory.payroll;

import com.josh.domain.payroll.UserRate;

public class UserRateFactory
{
    public static UserRate buildUserRate(int rateCode, int userRate, int rateId)
    {
return new UserRate.Builder().rateCode(rateCode).userRate(userRate).rateId(rateId).build();
    }
}