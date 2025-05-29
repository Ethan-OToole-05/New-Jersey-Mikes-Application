package com.pluralsight.models;

import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;

public class BLT extends Sandwich {

    public BLT() {
        super(

                /*
                -We are pre-assigning all the information that makes a BLT sandwich everytime a new BLT sandwich is made.
                 */

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
