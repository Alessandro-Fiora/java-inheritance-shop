package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        // * Smartphone
        Smartphone iphone12 = new Smartphone("iPhone 12", "Samsung", 999.99, 128);
        System.out.println("Smartphone: " + iphone12.getName());
        iphone12.setbrand("Apple");
        System.out.println("Brand: " + iphone12.getbrand());
        System.out.println("Full price: " + iphone12.getFullPrice());

        // * Tv
        Tv samsungTv = new Tv("Samsung TV", "LG", 499.99, 55, true);
        System.out.println("TV: " + samsungTv.getName());
        samsungTv.setbrand("Samsung");
        System.out.println("Brand: " + samsungTv.getbrand());
        System.out.println("Full price: " + samsungTv.getFullPrice());
    }
}
