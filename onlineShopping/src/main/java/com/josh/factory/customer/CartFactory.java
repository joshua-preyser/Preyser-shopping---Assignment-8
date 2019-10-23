package com.josh.factory.customer;


import com.josh.domain.customer.Cart;

public class CartFactory
{
    public static Cart buildCart(int cartId, int productId, int dateAdded)
    {
return new Cart.Builder().cartId(cartId).productId(productId).dateAdded(dateAdded).build();
    }
}