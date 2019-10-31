package com.josh.service.customer;

import java.util.Set;

import com.josh.domain.customer.Cart;
import com.josh.service.IService;

public interface CartService extends IService<Cart, String>
{
Set<Cart> getAll();
}