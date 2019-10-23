package com.josh.factory.product;

import com.josh.domain.product.OrderedProduct;

public class OrderedProductFactory
{
    public static OrderedProduct buildOrderedProduct(int productId, String productName, String productDesc)
    {
return new OrderedProduct.Builder().productId(productId).productName(productName).productDesc(productDesc).build();
    }
}