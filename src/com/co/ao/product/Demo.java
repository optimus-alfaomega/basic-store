package com.co.ao.product;

public class Demo {

    public static void main(String[] args) {
        Product leche = new Food();
        leche.iva();
        leche.description();
        leche.CalculatePriceWithIva();

        leche.iva(10).price(10).name("leche algarra").CalculatePriceWithoutIva().CalculatePriceWithIva();

    }

}
