package com.josh.service.product;

import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.service.IService;

public interface OrderedProductService extends IService<OrderedProduct, String>
{
Set<OrderedProduct> getAll();
}