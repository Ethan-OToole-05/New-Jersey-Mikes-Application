package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    //Holds all of our items that the customer orders.
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private double totalPrice;

    public Order() {

    }

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public void addSandwich(Sandwich sandwich) {
        this.sandwiches.add(sandwich);
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public List<Drink> getDrinks() {
       return drinks;
    }

    public void addChips(Chips chips) {
        this.chips.add(chips);
    }

    public List<Chips> getChips() {
        return chips;
    }

    public double getTotalPrice() {
        double grandTotal = 0;
        if(!sandwiches.isEmpty()) {
            for(Sandwich sandwich : sandwiches) {
                grandTotal += sandwich.getPrice();
            }
        }
        if(!drinks.isEmpty()) {
            for(Drink drink : drinks) {
                grandTotal += drink.getPrice();
            }
        }
        if(!chips.isEmpty()) {
            for(Chips chip : chips) {
                grandTotal += chip.getPrice();
            }
        }
        totalPrice = grandTotal;
        return grandTotal;

    }
}
