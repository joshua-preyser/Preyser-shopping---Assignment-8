package com.josh.repository.payroll;

import java.util.Set;

import com.josh.domain.payroll.Payment;
import com.josh.repository.IRepository;

public interface PaymentRepository extends IRepository<Payment, String>
{
Set<Payment> getAll();
}