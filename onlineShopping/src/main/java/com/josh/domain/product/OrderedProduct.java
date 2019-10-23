package com.josh.domain.product;


public class OrderedProduct
{
    private int productId;
    private String productName;
    private String productDesc;

    private OrderedProduct()
    {
    }

    public OrderedProduct(Builder builder) {
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.productDesc = builder.productDesc;
    }

    public int getProductId()
    {
        return productId;
    }

    public String getProductName()
    {
        return productName;
    }
    public String getProductDesc()
    {
        return productDesc;
    }

    public static class Builder
    {
    private int productId;
    private String productName;
    private String productDesc;

        public Builder productId(int productId)
        {
        this.productId = productId;
        return this;
        }
        public Builder productName(String productName)
        {
        this.productName = productName;
        return this;
        }
        public Builder productDesc(String productDesc)
        {
        this.productDesc = productDesc;
        return this;
        }

        public Builder copy(OrderedProduct orderedProduct)
        {
        this.productId = orderedProduct.productId;
        this.productName = orderedProduct.productName;
        this.productDesc = orderedProduct.productDesc;
        return this;
        }

        public OrderedProduct build()
        {
        return new OrderedProduct(this);
        }

    }

    @Override
    public String toString() {
        return "OrderedProduct [productDesc=" + productDesc + ", productId=" + productId + ", productName="
                + productName + "]";
    }



}