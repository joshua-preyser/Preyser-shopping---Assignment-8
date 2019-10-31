package com.josh.service.product;

import java.util.Set;

import com.josh.domain.product.Product;
import com.josh.service.IService;

public interface ProductService extends IService<Product, String>
{
Set<Product> getAll();
}