package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

    private Prodotto[] prodotti = new Prodotto[0];

    // public Carrello(Prodotto[] prodotti) {
    //     this.prodotti = prodotti;
    // }

    public Prodotto[] getProdotti() {
        return this.prodotti;
    }

    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public void addProdotto(Prodotto prodotto) {
        Prodotto[] newProdotti = new Prodotto[this.prodotti.length + 1];
        for (int i = 0; i < this.prodotti.length; i++) {
            newProdotti[i] = this.prodotti[i];
        }
        newProdotti[this.prodotti.length] = prodotto;
        this.prodotti = newProdotti;
    }

    // * Utility methods

    public double getDiscountedTotal() {
        double total = 0;
        for (Prodotto prodotto : this.prodotti) {
            total += prodotto.getDiscountedPrice();
        }
        return total;
    }

    public double getTotal() {
        double total = 0;
        for (Prodotto prodotto : this.prodotti) {
            total += prodotto.getFullPrice();
        }
        return total;
    }

    public boolean askAddProdotto() {
        System.out.println("Vuoi aggiungere un prodotto al carrello? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.toLowerCase().equals("y")) {
            this.askProdotto();
            return true;
        } else {
            return false;
        }
    }

    public void askProdotto() {
        System.out.println("Quale prodotto vuoi aggiungere?");
        System.out.println("1. Smartphone");
        System.out.println("2. TV");
        System.out.println("3. Headphones");
        Scanner scanner = new Scanner(System.in);
        int product = scanner.nextInt();
        scanner.nextLine(); 
        switch (product) {
            case 1:
                System.out.println("Nome: ");
                String name = scanner.nextLine();
                System.out.println("Marca: ");
                String brand = scanner.nextLine();
                System.out.println("Prezzo iva esclusa: ");
                double basePrice = scanner.nextDouble();
                System.out.println("Capacità di archiviazione (GB): ");
                int storageCapacity = scanner.nextInt();
                Smartphone smartphone = new Smartphone(name, brand, basePrice, storageCapacity);
                this.addProdotto(smartphone);
                System.out.println("Prodotto aggiunto: " + smartphone.getName());
                break;
            case 2:
                System.out.println("Nome: ");
                name = scanner.nextLine();
                System.out.println("Marca: ");
                brand = scanner.nextLine();
                System.out.println("Prezzo iva esclusa: ");
                basePrice = scanner.nextDouble();
                System.out.println("Pollici: ");
                int inches = scanner.nextInt();
                System.out.println("E' smart? (true/false): ");
                boolean smart = scanner.nextBoolean();
                Tv tv = new Tv(name, brand, basePrice, inches, smart);
                this.addProdotto(tv);
                System.out.println("Prodotto aggiunto: " + tv.getName());
                break;
            case 3:
                System.out.println("Nome: ");
                name = scanner.nextLine();
                System.out.println("Marca: ");
                brand = scanner.nextLine();
                System.out.println("Prezzo iva esclusa: ");
                basePrice = scanner.nextDouble();
                System.out.println("Colore: ");
                String color = scanner.next();
                System.out.println("E' wireless? (true/false): ");
                boolean wireless = scanner.nextBoolean();
                Headphones headphones = new Headphones(name, brand, basePrice, color, wireless);
                this.addProdotto(headphones);
                System.out.println("Prodotto aggiunto: " + headphones.getName());
                break;
            default:
                System.out.println("Prodotto non disponibile");
                break;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Prodotto prodotto : this.prodotti) {
            result += prodotto.toString() + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Checkout carrello");
        Carrello carrello = new Carrello();
        boolean continueAdding = true;
    
        while (continueAdding) {
            continueAdding = carrello.askAddProdotto();
        }
        
        System.out.println("Carrello:");
        System.out.println(carrello);
        System.out.println(String.format("Totale: € %.2f", carrello.getTotal()));

        System.out.println("Hai la carta fedeltà? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.toLowerCase().equals("y")) {
            double total = carrello.getDiscountedTotal();
            System.out.println(String.format("Totale scontato: € %.2f", total));
        }else {
        double total = carrello.getTotal();
        System.out.println(String.format("Totale: € %.2f", total));
        
        }
        
    }
}
