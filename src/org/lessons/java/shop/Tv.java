package org.lessons.java.shop;

public class Tv extends Prodotto {

    protected int inches;
    protected boolean isSmart;

    public Tv(String name, String brand, double basePrice, int inches, boolean isSmart) {
        super(name, brand, basePrice);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    public int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.inches + " Pollici" + " - " + this.getbrand() + " - €" + this.getFullPrice();
    }

    @Override
    public double getDiscountedPrice() {
        int discountPercentage = 2;

        if (this.isSmart) {
            discountPercentage = 10;
        }

        return this.getFullPrice() - (this.getFullPrice() * discountPercentage / 100);
    }

}
