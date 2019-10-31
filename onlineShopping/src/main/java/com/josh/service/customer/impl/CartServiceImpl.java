package com.josh.service.customer.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.customer.Cart;
import com.josh.service.customer.CartService;

public class CartServiceImpl implements CartService {
    private static CartServiceImpl service = null;
    private Set<Cart> trolley;

    private CartServiceImpl() {
        this.trolley = new HashSet<>();
    }

    private Cart findCart(String cartId) {
        return this.trolley.stream().filter(trolley -> trolley.getId().trim().equals(cartId)).findAny()
                .orElse(null);
    }

    public static CartServiceImpl getService() {
        if (service == null)
            service = new CartServiceImpl();
        return service;

}

    @Override
    public Cart create(Cart cart) {
        this.trolley.add(cart);
        return cart;
    }

    @Override
    public Cart update(Cart cart) {
        Cart toUpdate = findCart(account.getId());
        if (toUpdate != null) {
            this.trolley.remove(toUpdate);
            return create(cart);
        }
        return null;
    }

    @Override
    public void delete(String cartId) {
        Cart cart = findCart(cartId);
        if (cart != null)
            this.trolley.remove(cart);
    }

    @Override
    public Cart read(final String cartId) {
        Cart cart = findCart(cartId);
        return account;
    }

    @Override
    public Set<Cart> getAll() {

        return this.trolley;
    }
}