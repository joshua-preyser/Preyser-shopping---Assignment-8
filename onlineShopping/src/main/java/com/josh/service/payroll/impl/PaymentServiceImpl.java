package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.Payment;
import com.josh.repository.payroll.PaymentRepository;
import com.josh.repository.payroll.impl.PaymentRepositoryImpl;
import com.josh.service.payroll.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    private static PaymentServiceImpl service = null;
    private PaymentRepository repository;

    private PaymentServiceImpl() {
<<<<<<< HEAD
        this.repository = EmployeePayRepository.getRepository();
    }

    public static PaymentServiceImpl getService() {
        if (service == null)
            service = new PaymentServiceImpl();
=======
        this.repository = PaymentRepositoryImpl.getRepository();
    }

    public static PaymentServiceImpl getService(){
        if (service == null) service = new PaymentServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
        return service;
    }

    @Override
    public Payment create(Payment payment) {
        return this.repository.create(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return this.repository.update(payment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Payment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Payment> getAll() {
        return this.repository.getAll();
    }
}
