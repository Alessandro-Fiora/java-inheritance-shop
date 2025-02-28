package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    protected int code;
    protected String name;
    protected String brand;
    protected double basePrice;
    protected int taxPercentage;

    // * Constructors

    public Prodotto() {
        this.code = generateRandomProductCode();
        this.name = "";
        this.brand = "";
        this.basePrice = 0.0;
        this.taxPercentage = 22;
    }

    public Prodotto(String name, String brand, double basePrice) {
        this.code = generateRandomProductCode();
        this.name = name;
        this.brand = brand;
        this.basePrice = basePrice;
        this.taxPercentage = 22;
    }

    // * Getters and Setters

    public int getCode() {
        return this.code;
    }

    // Private perchè non accessibile dall'esterno
    private void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbrand() {
        return this.brand;
    }   

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getBasePrice() {
        return String.format("%.2f", this.basePrice);
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getTaxPercentage() {
        return this.taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    // * Utility methods

    public String getFullPrice() {
        return String.format("%.2f", this.basePrice + (this.basePrice * this.taxPercentage / 100));
    }

    public String getFullName(){
        if (this.name != null && this.name.length() > 0) {
            return this.code + "-" + this.name;
        } else {
            return "Prodotto non valido";
        }
    }

    private int generateRandomProductCode() {
        Random random = new Random();
        return random.nextInt(1000);
    }

}