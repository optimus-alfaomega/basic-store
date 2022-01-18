package com.co.ao.product.price;

import com.co.ao.product.Product;
import com.co.ao.product.factory.Market;
import com.co.ao.product.factory.Types;

public class Demo {
    public static void main(String[] args) {

        Product product = Market.create().productClothes().price(23).type(Types.clothes + "");

        Price price = new Pricing();
        Types t = Types.clothes;
        String idProduct = "1";
        price.setPrice(20, t, idProduct);

    }
}
