package com.josh.domain.product;

public class Product
{
    private String id, name, supplier;
    private Product()
    {

    }
    public Product(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.supplier = builder.supplier;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getSupplier()
    {
        return supplier;
    }

public static class Builder
{
    private String id, name, supplier;
    public Builder id(String id)
{
    this.id = id;
    return this;
}
public Builder name(String name)
{
    this.name = name;
    return this;
}
public Builder supplier(String supplier)
{
    this.supplier = supplier;
    return this;
}
public Builder copy(Product product)
{
    this.id = product.id;
    this.name = product.name;
    this.supplier = product.supplier;
    return this;
}
public Product build()
{
    return new Product(this);
}

        @Override
        public String toString() {
            return "Builder [id=" + id + ", name=" + name + ", supplier=" + supplier + "]";
        }

}
}