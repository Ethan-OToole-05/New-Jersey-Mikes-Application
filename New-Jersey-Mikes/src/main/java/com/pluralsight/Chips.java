package com.pluralsight;

public class Chips implements Item {
    private String nameBrand;
    private double price;

    @Override
    public double calculateTotal() {
        this.price = 1.50;
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

    @Override
    public String toString() {
        return "Chips{" +
                "nameBrand='" + nameBrand + '\'' +
                ", price=" + price +
                '}';
    }
}
