package com.pluralsight;

import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Item{
    private double price;
    private String size;
    private String bread;
    private List<String> meat = new ArrayList<>();
    private List<String> cheese = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauce = new ArrayList<>();
    private List<String> sides = new ArrayList<>();
    private boolean toastedStatus;

    public Sandwich() {

    }

    public Sandwich() {

    }

    public Sandwich(double price, String size, String bread, List<String> meat, List<String> cheese, List<String> toppings, List<String> sauce, List<String> sides, boolean toastedStatus) {
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
        return price;
    }

    public String getSize() {
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

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size='" + size + '\'' +
                ", bread='" + bread + '\'' +
                ", meat=" + meat +
                ", cheese=" + cheese +
                ", toppings=" + toppings +
                ", sauce=" + sauce +
                ", sides=" + sides +
                ", toastedStatus=" + toastedStatus +
                '}';
    }
}
