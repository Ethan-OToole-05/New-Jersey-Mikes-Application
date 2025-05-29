package com.pluralsight.models;

import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;

public class PhillyCheeseSteak extends Sandwich {

    public PhillyCheeseSteak() {
        super(
                /*
                -We are pre-assigning all the information that makes a Philly Cheese Steak sandwich everytime a new one is made.
                 */

                SandwichHelper.sizes[1],
                1,
                "White",
                new ArrayList<>(List.of("Steak")),
                new ArrayList<>(List.of("American")),
                new ArrayList<>(List.of("Peppers")),
                new ArrayList<>(List.of("Mayo")),
                new ArrayList<>(),
                true
        );
    }

}
