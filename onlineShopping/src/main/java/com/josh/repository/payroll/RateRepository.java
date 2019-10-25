package com.josh.repository.payroll;

import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.repository.IRepository;

public interface RateRepository extends IRepository<Rate, String>
{
Set<Rate> getAll();
}