package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Smartphone Iphone12 = new Smartphone("iPhone 12", "Apple", 999.99, 128);
        System.out.println("Smartphone: " + Iphone12.getName());
        System.out.println("Brand: " + Iphone12.getbrand());
        System.out.println("Base price: " + Iphone12.getFullPrice());
    }
}
