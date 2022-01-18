package com.co.ao.product.price;

import com.co.ao.product.Product;
import com.co.ao.product.factory.*;

public interface Price {
    public boolean setPrice(float newPrice, Types t, String idProduct);

}
