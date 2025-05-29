package com.pluralsight.models;

import com.pluralsight.util.Item;

public class Drink implements Item {

    /*
    -All the properties on what will make a drink.
     */

    private String flavor;
    private double price;
    private String size;
    private int sizeIndex;
    private static final double[] drinkPrices = {2.00, 2.50, 3.00};

    /*
    -All getters and setters below.
     */

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

    /*
    -Method below will calculate the total price of a drink based on the size.
    -Then the result will be assigned to the drink price based on drink size.
     */

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

    /*
    -toString() below is used to format the way drinks will be represented.
     */

    @Override
    public String toString() {
        return String.format("Flavor: %s | Size: %s | Total Price: $%.2f", flavor, size, price);
    }
}
