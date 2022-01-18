package com.co.ao.product.factory;

import com.co.ao.product.Product;
import com.co.ao.product.factory.Types;

public interface FactoryProduct {

    public Product productClothes();

    public Product productElectronic();

    public Product productFood();

    public Product productHome();

    public Product getProduct(String id, Types type);
}
