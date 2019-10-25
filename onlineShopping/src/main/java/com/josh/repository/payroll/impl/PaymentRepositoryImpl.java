package com.josh.repository.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.Payment;
import com.josh.repository.payroll.PaymentRepository;

public class PaymentRepositoryImpl implements PaymentRepository {
    private static PaymentRepositoryImpl repository = null;
    private Set<Payment> p;

    private PaymentRepositoryImpl() {
        this.p = new HashSet<>();
    }

    private Payment findPayment(String paymentId) {
        return this.p.stream().filter(p -> p.getId().trim().equals(paymentId)).findAny()
                .orElse(null);
    }

    public static PaymentRepositoryImpl getRepository() {
        if (repository == null)
            repository = new PaymentRepositoryImpl();
        return repository;

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