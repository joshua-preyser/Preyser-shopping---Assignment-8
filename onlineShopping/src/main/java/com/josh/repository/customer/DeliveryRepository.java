package com.josh.repository.customer;

import java.util.Set;

import com.josh.domain.customer.Delivery;
import com.josh.repository.IRepository;

public interface DeliveryRepository extends IRepository<Delivery, String>
{
Set<Delivery> getAll();
}