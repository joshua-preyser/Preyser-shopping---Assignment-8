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
        this.repository = EmployeePayRepository.getRepository();
    }

    public static PaymentServiceImpl getService() {
        if (service == null)
            service = new PaymentServiceImpl();
        return service;

}

    @Override
    public Payment create(Payment payment) {
        this.p.add(payment);
        return payment;
    }

    @Override
    public Payment update(EmployeePay employeePay) {
        Payment toUpdate = findPayment(payment.getId());
        if (toUpdate != null) {
            this.p.remove(toUpdate);
            return create(payment);
        }
        return null;
    }

    @Override
    public void delete(String paymentId) {
        Payment payment = findPayment(paymentId);
        if (payment != null)
            this.p.remove(payment);
    }

    @Override
    public Payment read(final String paymentId) {
        Payment payment = findPayment(paymentId);
        return payment;
    }

    @Override
    public Set<Payment> getAll() {

        return this.p;
    }
}