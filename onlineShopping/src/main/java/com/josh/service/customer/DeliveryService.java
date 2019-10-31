package com.josh.service.customer;

import java.util.Set;

import com.josh.domain.customer.Delivery;
import com.josh.service.IService;

public interface DeliveryService extends IService<Delivery, String>
{
Set<Delivery> getAll();
}