package com.pluralsight;

public class Sandwich {
    private double price;
    private int size;
    private String bread;
    private String meat;
    private String cheese;
    private String toppings;
    private String sauce;
    private String sides;
    private boolean toastedStatus;

    public Sandwich(int size, String bread, String meat, String cheese, String toppings, String sauce, String sides, boolean toastedStatus) {
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauce = sauce;
        this.sides = sides;
        this.toastedStatus = toastedStatus;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public boolean isToastedStatus() {
        return toastedStatus;
    }

    public void setToastedStatus(boolean toastedStatus) {
        this.toastedStatus = toastedStatus;
    }
}
