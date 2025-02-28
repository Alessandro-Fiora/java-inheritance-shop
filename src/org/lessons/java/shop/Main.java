package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Smartphone iphone12 = new Smartphone("iPhone 12", "Samsung", 999.99, 128);
        System.out.println("Smartphone: " + iphone12.getName());
        iphone12.setbrand("Apple");
        System.out.println("Brand: " + iphone12.getbrand());
        System.out.println("Base price: " + iphone12.getFullPrice());
    }
}
