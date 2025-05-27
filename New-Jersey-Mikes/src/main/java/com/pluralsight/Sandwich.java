package com.pluralsight;

import java.util.List;

public class Sandwich implements Item{
    private double price;
    private int size;
    private String bread;
    private List<String> meat;
    private List<String> cheese;
    private List<String> toppings;
    private List<String> sauce;
    private List<String> sides;
    private boolean toastedStatus;

    public Sandwich(double price, int size, String bread, List<String> meat, List<String> cheese, List<String> toppings, List<String> sauce, List<String> sides, boolean toastedStatus) {
        this.price = price;
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauce = sauce;
        this.sides = sides;
        this.toastedStatus = toastedStatus;
    }

    public void addMeat(String meat) {
        this.meat.add(meat);
    }

    public void addSize(int size) {
        this.size = size;
    }



    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getBread() {
        return bread;
    }

    public List<String> getMeat() {
        return meat;
    }

    public List<String> getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public List<String> getSides() {
        return sides;
    }

    public boolean isToastedStatus() {
        return toastedStatus;
    }

    @Override
    public double calculateTotal() {
        return 0.0;
    }
}
