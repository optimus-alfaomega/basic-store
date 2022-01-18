package com.co.ao.product;

public interface Product {
    public Product CalculatePriceWithoutIva();

    public Product iva(int iva);

    public Product iva();

    public Product name(String name);

    public Product name();

    public Product CalculatePriceWithIva();

    public Product id();

    public Product id(String id);

    public Product type(String type);

    public Product type();

    public Product description();

    public Product description(String description);

    public Product price();

    public Product price(float standarPrice);

    public Product quantity();

    public Product quantity(float quantity);

}