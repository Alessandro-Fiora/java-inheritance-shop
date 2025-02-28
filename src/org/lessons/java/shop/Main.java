package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        // * Smartphone
        Smartphone iphone12 = new Smartphone("iPhone 12", "Samsung", 999.99, 128);
        System.out.println("Smartphone: " + iphone12.getName());
        iphone12.setbrand("Apple");
        System.out.println("Brand: " + iphone12.getbrand());
        System.out.println("Full price: " + iphone12.getFullPrice());
        iphone12.setStorageCapacity(256);
        System.out.println("Storage capacity: " + iphone12.getStorageCapacity());
        System.out.println("Code: " + iphone12.getCode());

        // * Tv
        Tv samsungTv = new Tv("Samsung TV", "LG", 499.99, 55, true);
        System.out.println("TV: " + samsungTv.getName());
        samsungTv.setbrand("Samsung");
        System.out.println("Brand: " + samsungTv.getbrand());
        System.out.println("Full price: " + samsungTv.getFullPrice());
        samsungTv.setInches(65);
        System.out.println("Inches: " + samsungTv.getInches());
        System.out.println("Code: " + samsungTv.getCode());

        // * Headphones
        Headphones airpods = new Headphones("Airpods", "Samsung", 199.99, "White", true);
        System.out.println("Headphones: " + airpods.getName());
        airpods.setbrand("Apple");
        System.out.println("Brand: " + airpods.getbrand());
        System.out.println("Full price: " + airpods.getFullPrice());
        airpods.setColor("Black");
        System.out.println("Color: " + airpods.getColor());
        System.out.println("Code: " + airpods.getCode());

    }
}
