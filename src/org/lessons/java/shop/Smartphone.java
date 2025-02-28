package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {

    protected int IMEI;
    protected int storageCapacity;

    public Smartphone(String name, String brand, double basePrice, int storageCapacity) {
        super(name, brand, basePrice);
        this.IMEI = generateRandomIMEI();
        this.storageCapacity = storageCapacity;
    }

    public int getIMEI() {
        return this.IMEI;
    }

    // Private perchè non settabile dall'esterno
    private void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // * Utility methods

    private int generateRandomIMEI() {
        return new Random().nextInt(1000000000);
    }

}
