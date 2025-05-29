package com.pluralsight.models;

import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;

public class BLT extends Sandwich {

    public BLT() {
        super(
                //BASE PRICE IS: 10.50

                SandwichHelper.sizes[1],
                1,
                "White",
                new ArrayList<>(List.of("Bacon")),
                new ArrayList<>(List.of("Cheddar")),
                new ArrayList<>(List.of("Lettuce", "Tomatoes")),
                new ArrayList<>(List.of("Ranch")),
                new ArrayList<>(),
                true
        );

    }

}
