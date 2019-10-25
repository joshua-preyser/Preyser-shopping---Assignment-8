package com.josh.repository.customer;

import java.util.Set;

import com.josh.domain.customer.Cart;
import com.josh.repository.IRepository;

public interface CartRepository extends IRepository<Cart, String>
{
Set<Cart> getAll();
}