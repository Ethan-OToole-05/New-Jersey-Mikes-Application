package com.pluralsight.models;

import com.pluralsight.util.Item;

public class Chips implements Item {
    private String nameBrand;
    private double price;

    /*
    -Calculate the total of chips that will be $1.50 and assign it to the price of chips.
    */

    @Override
    public double calculateTotal() {
        this.price = 1.50;
        return this.price;
    }

    /*
    -Getters and setters below to get or set properties of chips.
     */

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    /*
    -toString() method used to format how chips will be represented when printed.
     */

    @Override
    public String toString() {
        return String.format("Brand: %s | Total Price: $%.2f", nameBrand, price);
    }
}
