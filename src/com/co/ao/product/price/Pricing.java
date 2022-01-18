package com.co.ao.product.price;

import com.co.ao.product.factory.Types;
import com.co.ao.product.Product;
import com.co.ao.product.factory.Market;

public class Pricing implements Price {

    @Override
    public boolean setPrice(float newPrice, Types t, String idProduct) {

        Product p = Market.create().getProduct(idProduct, t).price(newPrice);
        if (p != null)
            return true;
        else
            return false;

    }

}
