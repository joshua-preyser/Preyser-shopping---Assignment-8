package com.josh.domain.customer;


public class Cart
{
    private int cartId, productId, dateAdded;

    private Cart()
    {
    }

    public Cart(Builder builder) {
        this.cartId = builder.cartId;
        this.productId = builder.productId;
        this.dateAdded = builder.dateAdded;
    }

    public int getCartId()
    {
        return cartId;
    }

    public int getProductId()
    {
        return productId;
    }
    public int getDateAdded()
    {
        return dateAdded;
    }

    public static class Builder
    {
    private int cartId, productId, dateAdded;

        public Builder cartId(int cartId)
        {
        this.cartId = cartId;
        return this;
        }
        public Builder productId(int productId)
        {
        this.productId = productId;
        return this;
        }
        public Builder dateAdded(int dateAdded)
        {
        this.dateAdded = dateAdded;
        return this;
        }

        public Builder copy(Cart cart)
        {
        this.cartId = cart.cartId;
        this.productId = cart.productId;
        this.dateAdded = cart.dateAdded;
        return this;
        }

        public Cart build()
        {
        return new Cart(this);
        }

    }

    @Override
    public String toString() {
        return "Cart [cartId=" + cartId + ", dateAdded=" + dateAdded + ", productId=" + productId + "]";
    }




}