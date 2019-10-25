package com.josh.repository.product;

import java.util.Set;

import com.josh.domain.product.Product;
import com.josh.repository.IRepository;

public interface ProductRepository extends IRepository<Product, String>
{
Set<Product> getAll();
}