package com.josh.service.payroll;

import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.service.IService;

public interface UserRateServiceR extends IService<UserRate, String>
{
Set<UserRate> getAll();
}