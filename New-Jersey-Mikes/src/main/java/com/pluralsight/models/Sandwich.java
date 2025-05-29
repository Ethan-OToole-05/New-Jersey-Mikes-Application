package com.pluralsight.models;

import com.pluralsight.util.Item;
import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Item {

    /*
    -All our properties below for what makes a sandwich.
     */

    protected double price;
    protected String size;
    protected int sizeIndex = 0;
    protected String bread;
    protected List<String> meat = new ArrayList<>();
    protected List<String> cheese = new ArrayList<>();
    protected List<String> toppings = new ArrayList<>();
    protected List<String> sauce = new ArrayList<>();
    protected List<String> sides = new ArrayList<>();
    protected boolean toastedStatus;

    public Sandwich() {

    }

    public Sandwich(String size, int sizeIndex, String bread, List<String> meat, List<String> cheese, List<String> toppings, List<String> sauce, List<String> sides, boolean toastedStatus) {
        this.size = size;
        this.sizeIndex = sizeIndex;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauce = sauce;
        this.sides = sides;
        this.toastedStatus = toastedStatus;
    }

    /*
    -All methods below will add meat, cheese, toppings, etc. To our sandwich.
     */

    public void addMeat(String meat) {
        this.meat.add(meat);
    }

    public void addCheese(String cheese) {
        this.cheese.add(cheese);
    }

    public void addToppings(String toppings) {
        this.toppings.add(toppings);
    }

    public void addSauce(String sauce) {
        this.sauce.add(sauce);
    }

    public void addSide(String side) {
        this.sides.add(side);
    }

    /*
    -All of our getters and setters below for each property of what makes a sandwich.
     */

    public double getPrice() {
        return this.price;
    }

    public String getSize() {
        return this.size;
    }

    public String getBread() {
        return this.bread;
    }

    public List<String> getMeat() {
        return this.meat;
    }

    public List<String> getCheese() {
        return this.cheese;
    }

    public List<String> getToppings() {
        return this.toppings;
    }

    public List<String> getSauce() {
        return this.sauce;
    }

    public List<String> getSides() {
        return this.sides;
    }

    public boolean isToastedStatus() {
        return this.toastedStatus;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setToastedStatus(boolean toastedStatus) {
        this.toastedStatus = toastedStatus;
    }

    /*
    -Below method will calculate the total sandwich based on size first and based of that we will assign a size index.
    -That size index will go to the index based on our SandwichHelper's array of prices.
    -EX: if the sandwich is small our size index is 0. SandwichHelper.sizePrices == 5.50 to represent the bread price of a 4" sandwich.
    -Then we will look at all the prices that have the same index as our small size.
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

        //Gets the bread price.
        total += SandwichHelper.sizePrices[sizeIndex];

        //Gets the first meat price.
        total += SandwichHelper.meatPrices[sizeIndex];

        //If there is more than one meat we will add the extra meat price until we're back to the first meat.
        if (meat.size() > 1) {
            for (int i = meat.size(); i > 1; i--) {
                total += SandwichHelper.extraMeatPrices[sizeIndex];
            }
        }

        //Adds the first cheese price.
        total += SandwichHelper.cheesePrices[sizeIndex];

        //If there is more than one cheese we will add the extra cheese price until we're back to the first cheese.
        if (cheese.size() > 1) {
            for (int i = cheese.size(); i > 1; i--) {
                total += SandwichHelper.extraCheesePrices[sizeIndex];
            }
        }

        //Assigns the total price of the sandwich and returns the total.

        this.price = total;

        return total;
    }

    /*
    -Prints out the structured way to show the details of the sandwich.
    */

    @Override
    public String toString() {
        String status = "";
        if (toastedStatus) {
            status = "Yes";
        } else {
            status = "No";
        }
        return String.format("Size: %s | Bread: %s | Meat(s): %s | Cheese: %s | Topping(s): %s | Sauce(s): %s | Side: %s | Toasted: %s | Total Price: $%.2f",
                size, bread, meat, cheese, toppings, sauce, sides, status, price);
    }
}
