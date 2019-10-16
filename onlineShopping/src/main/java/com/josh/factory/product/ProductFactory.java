package com.josh.factory.product;

import com.josh.domain.product.Product;

public class ProductFactory
{
    public static Product buildProduct(String id, String name, String supplier)
    {
        return new Product.Builder().id(id).name(name).supplier(supplier).build();
    }
}