package org.lessons.java.shop;

public class Headphones extends Prodotto {

    protected String color;
    protected boolean isWireless;

    public Headphones(String name, String brand, double basePrice, String color, boolean isWireless) {
        super(name, brand, basePrice);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

}
