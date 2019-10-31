package com.josh.service.payroll;

import java.util.Set;

import com.josh.domain.payroll.Payment;
import com.josh.service.IService;

public interface PaymentService extends IService<Payment, String>
{
Set<Payment> getAll();
}