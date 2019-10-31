package com.josh.service.payroll;

import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.service.IService;

public interface RateService extends IService<Rate, String>
{
Set<Rate> getAll();
}