package com.pluralsight;

import java.util.List;

public class Order {

    //Holds all of our items that the customer orders.
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private double totalPrice;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips, double totalPrice) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.totalPrice = totalPrice;
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
        //TODO: GET THE TOTAL PRICE OF ALL THE ITEMS.
        return 0.0;
    }

    //TODO: ADD toString SUMMARY FOR ALL ITEMS AND TOTAL PRICE.
    //
}
