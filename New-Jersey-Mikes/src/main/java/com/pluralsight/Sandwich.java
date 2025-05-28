package com.pluralsight;

import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Item {
    private double price;
    private String size;
    private int sizeIndex = 0;
    private String bread;
    private List<String> meat = new ArrayList<>();
    private List<String> cheese = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauce = new ArrayList<>();
    private List<String> sides = new ArrayList<>();
    private boolean toastedStatus;

    public Sandwich() {

    }

//    public Sandwich(String size) {
//
//    }

//    public Sandwich(double price, String size, String bread, List<String> meat, List<String> cheese, List<String> toppings, List<String> sauce, List<String> sides, boolean toastedStatus) {
//        this.price = price;
//        this.size = size;
//        this.bread = bread;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.toppings = toppings;
//        this.sauce = sauce;
//        this.sides = sides;
//        this.toastedStatus = toastedStatus;
//    }


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

        total += SandwichHelper.sizePrices[sizeIndex];

        total += SandwichHelper.meatPrices[sizeIndex];

        if (meat.size() > 1) {
            //Might need loop to iterate all the extra meats and cheeses.
            for (int i = meat.size(); i > 1; i--) {
                total += SandwichHelper.extraMeatPrices[sizeIndex];
            }
        }

        total += SandwichHelper.cheesePrices[sizeIndex];

        if (cheese.size() > 1) {
            for (int i = cheese.size(); i > 1; i--) {
                total += SandwichHelper.extraCheesePrices[sizeIndex];
            }
        }

        this.price = total;

        return total;
    }

    @Override
    public String toString() {
        return String.format("Size: %s | Bread: %s | Meat(s): %s | Cheese: %s | Topping(s): %s | Sauce(s): %s | Side: %s | Toasted: %b | Total Price: $%.2f",
                size, bread, meat, cheese, toppings, sauce, sides, toastedStatus, price );
    }
}
