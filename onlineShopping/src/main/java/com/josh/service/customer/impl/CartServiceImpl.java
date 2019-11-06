package com.josh.service.customer.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.customer.Cart;
import com.josh.service.customer.CartService;

public class CartServiceImpl implements CartService {
    private static CartServiceImpl service = null;
    private CartRepository repository;

    private CartServiceImpl() {
        this.repository = CartRepositoryImpl.getRepository();
    }

    public static CartServiceImpl getService(){
        if (service == null) service = new CartServiceImpl();
        return service;
    }

    @Override
    public Cart create(Cart cart) {
        return this.repository.create(cart);
    }

    @Override
    public Cart update(Cart cart) {
        return this.repository.update(cart);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Cart read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Cart> getAll() {
        return this.repository.getAll();
    }
}
