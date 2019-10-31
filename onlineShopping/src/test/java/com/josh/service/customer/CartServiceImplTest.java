package com.josh.service.customer;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.customer.Cart;
import com.josh.factory.customer.CartFactory;
import com.josh.service.customer.impl.CartServiceImpl;

import org.junit.Before;

public class CartServiceImplTest
{
private CartService service;
private Cart cart;
private Cart getSavedCart()
{
    Set<Cart> savedCart = this.service.getAll();
    return savedCart.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = CartServiceImpl.getService();
    this.cart = CartFactory.buildCart(cartId, productId, dateAdded)
}

@Test
public void a_create()
{
    Cart createdCart = this.service.create(this.cart);
    System.out.println("in create, createdCart = " + createdCart);
    e_getAll();
    Assert.assertSame(createdCart, this.cart);
}

@Test
public void b_read()
{
    Cart savedCart = getSavedCart();
    System.out.println("readCart, cartId = " + savedCart.getId());
    Cart read = this.service.read(savedCart.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedCart, read);
e_getAll();
}

@Test
public void c_update()
{
    String newProductId = "new cart productId test";
    Cart cart = new Cart.Builder().copy(getSavedCart()).productId(newProductId).build();
    System.out.println("about to update = " + cart);
    Cart updatedCart = this.service.update(cart);
    System.out.println("updated cart = " + updatedCart);
    Assert.assertSame(newProductId, updatedCart.getProductId());
    e_getAll();
}

@Test
public void d_delete()
{
    Cart savedCart = getSavedCart();
    this.service.delete(savedCart.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Cart> all = this.service.getAll();
    System.out.println("all = " + all);
}
}