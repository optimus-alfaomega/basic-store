package com.co.ao.product.factory;

import java.util.HashMap;

import com.co.ao.product.Clothes;
import com.co.ao.product.Electronic;
import com.co.ao.product.Food;
import com.co.ao.product.Home;
import com.co.ao.product.Product;
import com.co.ao.product.factory.Types;

public class Market implements FactoryProduct {

    private static HashMap<String, Product> clothes;
    private static HashMap<String, Product> electronic;
    private static HashMap<String, Product> home;
    private static HashMap<String, Product> food;
    private static double count;
    private static Market market = new Market();

    private Market() {
        count = 0;
        clothes = new HashMap<String, Product>();
        home = new HashMap<String, Product>();
        food = new HashMap<String, Product>();
        home = new HashMap<String, Product>();

    }

    public static Market create() {
        return market;
    }

    @Override
    public Product productClothes() {
        Product product = new Clothes();
        count++;
        product.id(count + "");
        clothes.put(count + "", product);
        return product;
    }

    @Override
    public Product productElectronic() {

        Product product = new Electronic();
        count++;
        product.id(count + "");
        clothes.put(count + "", product);
        return product;
    }

    @Override
    public Product productFood() {
        Product product = new Food();
        count++;
        product.id(count + "");
        clothes.put(count + "", product);
        return product;

    }

    @Override
    public Product productHome() {
        Product product = new Home();
        count++;
        product.id(count + "");
        clothes.put(count + "", product);
        return product;

    }

    @Override
    public Product getProduct(String id, Types type) {
        Product p;

        switch (type) {
            case clothes:
                p = clothes.get(id);

                System.out.println(type + " " + id);
                break;
            case electronic:
                p = electronic.get(id);
                System.out.println(type + " " + id);

                break;
            case food:
                p = food.get(id);
                System.out.println(type + " " + id);

                break;
            case home:
                p = home.get(id);
                System.out.println(type + " " + id);

                break;
            default:
                p = null;
                System.out.println("default" + " ");

        }

        return p;
    }

}
