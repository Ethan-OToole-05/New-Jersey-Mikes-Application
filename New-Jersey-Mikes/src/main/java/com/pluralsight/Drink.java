package com.pluralsight;

public class Drink implements Item{
    private String flavor;
    private double price;
    private String size;
    private int sizeIndex;
    private static final double[] drinkPrices = {2.00, 2.50, 3.00};

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        if (this.size.equalsIgnoreCase("Small")) {
            this.sizeIndex = 0;
        } else if (this.size.equalsIgnoreCase("Medium")) {
            this.sizeIndex = 1;
        } else if (this.size.equalsIgnoreCase("Large")) {
            this.sizeIndex = 2;
        }

        total += drinkPrices[sizeIndex];

        this.price = total;

        return total;
    }

    @Override
    public String toString() {
//        return "Drink{" +
//                "flavor='" + flavor + '\'' +
//                ", price=" + price +
//                ", size='" + size + '\'';
        return String.format("Flavor: %s | Size: %s | Total Price: $%.2f", flavor, size, price);
    }
}
