package com.josh.repository.payroll;

import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.repository.IRepository;

public interface UserRateRepository extends IRepository<UserRate, String>
{
Set<UserRate> getAll();
}