package com.josh.repository.product;

import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.repository.IRepository;

public interface OrderedProductRepository extends IRepository<OrderedProduct, String>
{
Set<OrderedProduct> getAll();
}