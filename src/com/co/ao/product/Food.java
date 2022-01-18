package com.co.ao.product;

public class Food implements Product {

    private float standarPrice;
    private int iva;
    private String name;
    private float finalPrice;
    private String id;
    private String type;
    private String description;
    private float quantity;

    public Food() {

        this.type = "food";
        this.description = "undefined, no sale";
        this.id = "undefined";
        this.finalPrice = 0;
        this.iva = 0;
        this.standarPrice = 0;
        this.quantity = 0;

    }

    @Override
    public Product CalculatePriceWithoutIva() {
        System.out.println("$" + this.standarPrice);
        return this;
    }

    @Override
    public Product iva(int iva) {
        this.iva = iva;
        return this;
    }

    @Override
    public Product iva() {
        System.out.println(this.iva);
        return this;
    }

    @Override
    public Product name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Product name() {
        System.out.println(this.name);
        return this;
    }

    @Override
    public Product CalculatePriceWithIva() {
        float calcIva = (float) 10 / 100;
        finalPrice = this.standarPrice * calcIva + this.standarPrice;
        System.out.println("$" + this.finalPrice);
        return this;
    }

    @Override
    public Product id() {
        System.out.println(this.id);
        return this;
    }

    @Override
    public Product id(String id) {
        System.out.println(id);
        return this;
    }

    @Override
    public Product type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public Product type() {
        System.out.println(this.type);
        return this;
    }

    @Override
    public Product description() {
        System.out.println(this.description);
        return this;
    }

    @Override
    public Product description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Product price() {
        System.out.println(this.standarPrice);
        return this;
    }

    @Override
    public Product price(float standarPrice) {
        this.standarPrice = standarPrice;
        return this;
    }

    @Override
    public Product quantity() {
        System.out.println(this.quantity + "Unidades");
        return this;
    }

    @Override
    public Product quantity(float quantity) {
        this.quantity = quantity;
        return this;
    }
}