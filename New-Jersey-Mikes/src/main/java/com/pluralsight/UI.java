package com.pluralsight;

import com.pluralsight.util.SandwichHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    static Scanner input = new Scanner(System.in);
    //    static List<Sandwich> sandwiches;
//    static List<Drink> drinks;
//    static List<Chips> chips;
    static Order order = new Order();

    public static void display() {
        System.out.println("*******************");
        System.out.println("Welcome to the NEW Jersey Mike's!");
        System.out.println("*******************");
        while (true) {
            //Resets for a fresh new order everytime an order is canceled.
            order = new Order();
            System.out.println("Main Menu");
            System.out.println("1) Place New Order");
            System.out.println("0) Exit");
            System.out.print("Selection: ");

            int selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1:
                    processOrder();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input. Please Try Again.");
            }
        }
    }

    public static void processOrder() {
        //Make a new order of sandwiches for every new order to reset.
        System.out.println("*******************");
        System.out.println("Order Menu");
        System.out.println("*******************");
        while (true) {
            //TODO:NEED BETTER DO YOU WANT TO ORDER ANYTHING ELSE AFTER AN ADDITION.
            System.out.println("Please select an option below: ");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Selection: ");
            int selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1:
                    processAddSandwich();
                    break;
                case 2:
                    processAddDrink();
                    break;
                case 3:
                    processAddChips();
                    break;
                case 4:
                    processCheckout();
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void processAddSandwich() {

        //TODO: NEED BETTER ERROR HANDLING IN THE FUTURE. WRAP ARROUND TRY CATCH BLOCK
        System.out.println("What size sandwich would you like? ");
        //Start to make our new sandwich.
        Sandwich sandwich = new Sandwich();
        //TODO: HOW TO DISPLAY THE INCH MARKER WITHOUT CLOSING STRING
        for (int i = 0; i < SandwichHelper.sizes.length; i++) {
            System.out.printf("%d) %s\n", i + 1, SandwichHelper.sizes[i]);
        }
        System.out.print("Selection: ");
        int sizeSelection = input.nextInt();
        switch (sizeSelection) {
            case 1 -> sandwich.setSize("Small");
            case 2 -> sandwich.setSize("Medium");
            case 3 -> sandwich.setSize("Large");
            default -> System.out.println("Invalid selection. Please try again.");
        }
        input.nextLine();

        //WOULD WE NEED A BUNCH OF SWITCH STATEMENTS TO ASSIGN CORRECT PRICE FOR EACH?
        System.out.println("What bread would you like? ");
        for (int i = 0; i < SandwichHelper.bread.length; i++) {
            System.out.printf("%d) %s\n", i + 1, SandwichHelper.bread[i]);
        }
        System.out.print("Selection: ");
        int breadSelection = input.nextInt();
        switch (breadSelection) {
            case 1 -> sandwich.setBread("White");
            case 2 -> sandwich.setBread("Wheat");
            case 3 -> sandwich.setBread("Rye");
            case 4 -> sandwich.setBread("Wrap");
            default -> System.out.println("Invalid selection. Please try again.");
        }
        input.nextLine();


        boolean continueAnswer = true;
        while (continueAnswer) {
            System.out.println("What kind of meat would you like? ");

            for (int i = 0; i < SandwichHelper.meats.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.meats[i]);
            }

            System.out.print("Selection: ");

            int meatSelection = input.nextInt();
            switch (meatSelection) {
                case 1 -> sandwich.addMeat("Steak");
                case 2 -> sandwich.addMeat("Ham");
                case 3 -> sandwich.addMeat("Salami");
                case 4 -> sandwich.addMeat("Roast Beef");
                case 5 -> sandwich.addMeat("Chicken");
                case 6 -> sandwich.addMeat("Bacon");
                default -> System.out.println("Invalid selection. Please try again.");
            }
            input.nextLine();
            System.out.println("Would you like extra meat? (Y/N)");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                continueAnswer = false;
            }
        }

        continueAnswer = true;
        while (continueAnswer) {
            System.out.println("What kind of cheese would you like? ");
            for (int i = 0; i < SandwichHelper.cheese.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.cheese[i]);
            }
            System.out.println("0) None"); //HANDLE LATER
            System.out.print("Selection: ");
            int cheeseSelection = input.nextInt();
            switch (cheeseSelection) {
                case 1 -> sandwich.addCheese("American");
                case 2 -> sandwich.addCheese("Provolone");
                case 3 -> sandwich.addCheese("Cheddar");
                case 4 -> sandwich.addCheese("Swiss");
                default -> System.out.println("Invalid selection. Please try again.");
            }
            input.nextLine();
            System.out.println("Would you like extra cheese? (Y/N)");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                continueAnswer = false;
            }
        }
        continueAnswer = true;
        while (continueAnswer) {
            System.out.println("Would you like any toppings? ");
            for (int i = 0; i < SandwichHelper.regularToppings.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.regularToppings[i]);
            }
            System.out.print("Selection: ");
            int toppingSelection = input.nextInt();
            switch (toppingSelection) {
                case 1 -> sandwich.addToppings("Lettuce");
                case 2 -> sandwich.addToppings("Peppers");
                case 3 -> sandwich.addToppings("Onions");
                case 4 -> sandwich.addToppings("Tomatoes");
                case 5 -> sandwich.addToppings("Jalapenos");
                case 6 -> sandwich.addToppings("Cucumbers");
                case 7 -> sandwich.addToppings("Pickles");
                case 8 -> sandwich.addToppings("Guacamole");
                case 9 -> sandwich.addToppings("Mushrooms");
                default -> System.out.println("Invalid selection. Please try again.");

            }
            input.nextLine();
            System.out.println("Would you like an extra topping?");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                continueAnswer = false;
            }
        }

        continueAnswer = true;
        while (continueAnswer) {
            System.out.println("What kind of sauce would you like? ");
            for (int i = 0; i < SandwichHelper.sauces.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.sauces[i]);
            }
            System.out.println("0) None"); //HANDLE LATER
            System.out.print("Selection: ");
            int sauceSelection = input.nextInt();
            switch (sauceSelection) {
                case 1 -> sandwich.addSauce("Mayo");
                case 2 -> sandwich.addSauce("Mustard");
                case 3 -> sandwich.addSauce("Ketchup");
                case 4 -> sandwich.addSauce("Ranch");
                case 5 -> sandwich.addSauce("Thousand Islands");
                case 6 -> sandwich.addSauce("Vinaigrette");
                default -> System.out.println("Invalid selection. Please try again.");
            }
            input.nextLine();
            System.out.println("Would you like more sauce?");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                continueAnswer = false;
            }
        }

        System.out.println("Would you like a side?  ");
        for (int i = 0; i < SandwichHelper.sides.length; i++) {
            System.out.printf("%d) %s\n", i + 1, SandwichHelper.sides[i]);
        }
        System.out.println("0) None");
        System.out.print("Selection: ");
        int sideSelection = input.nextInt();
        switch (sideSelection) {
            case 0 -> System.out.println("No side selected");
            case 1 -> sandwich.addSide("Au Jus");
            case 2 -> sandwich.addSide("Sauce");
            default -> System.out.println("Invalid selection. Please try again.");
        }
        input.nextLine();

        System.out.println("Would you like it toasted? (Y/N)");
        System.out.print("Selection: ");
        String toastedStatus = input.nextLine().toUpperCase();
        if (toastedStatus.equals("Y")) {
            sandwich.setToastedStatus(true);
        } else {
            sandwich.setToastedStatus(false);
        }
        sandwich.calculateTotal();
//        sandwiches.add(sandwich);
        order.addSandwich(sandwich);

        System.out.println("Your sandwich is added to the order anything else? ");


    }

    public static void processAddDrink() {
        Drink drink = new Drink();
        System.out.println("What size drink would you like? ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Selection: ");
        int drinkSizeSelection = input.nextInt();
        input.nextLine();
        switch (drinkSizeSelection) {
            case 1 -> drink.setSize("Small");
            case 2 -> drink.setSize("Medium");
            case 3 -> drink.setSize("Large");
            default -> System.out.println("Invalid selection. Please try again.");
        }

        System.out.println("What kind of drink would you like? ");
        System.out.println("1) Coca-Cola");
        System.out.println("2) Diet Coca-Cola");
        System.out.println("3) Sprite");
        System.out.println("4) Dr.Pepper");
        System.out.println("5) Pepsi");
        System.out.println("6) Diet Pepsi");
        System.out.println("7) Fanta");
        System.out.println("8) Mug Root Beer");
        System.out.print("Selection: ");
        int flavorSelection = input.nextInt();
        input.nextLine();
        switch (flavorSelection) {
            case 1 -> drink.setFlavor("Coca-Cola");
            case 2 -> drink.setFlavor("Diet Coca-Cola");
            case 3 -> drink.setFlavor("Sprite");
            case 4 -> drink.setFlavor("Dr.Pepper");
            case 5 -> drink.setFlavor("Pepsi");
            case 6 -> drink.setFlavor("Diet Pepsi");
            case 7 -> drink.setFlavor("Fanta");
            case 8 -> drink.setFlavor("Mug Root Beer");
            default -> System.out.println("Invalid selection. Please try again.");
        }
        drink.calculateTotal();
//        drinks.add(drink);
        order.addDrink(drink);
        System.out.println("Your drink is added to the order anything else? ");

//        System.out.println(drinks);

    }

    public static void processAddChips() {
        Chips selectionChips = new Chips();
        System.out.println("What chips would you like? ");
        System.out.println("1) Doritos");
        System.out.println("2) Lays");
        System.out.print("Selection: ");
        int chipsSelection = input.nextInt();
        input.nextLine();
        switch (chipsSelection) {
            case 1 -> selectionChips.setNameBrand("Doritos");
            case 2 -> selectionChips.setNameBrand("Lays");
            default -> System.out.println("Invalid selection. Please try again.");
        }

        selectionChips.calculateTotal();
        order.addChips(selectionChips);

        System.out.println("Your chips is added to the order anything else? ");

    }

    public static void processCheckout() {
        System.out.println("*******************");
        System.out.println("Order Details");
        System.out.println("*******************");
        System.out.println("Sandwiches:");
        System.out.println(order.getSandwiches());
        System.out.println("*******************");
        System.out.println("Drinks: ");
        System.out.println(order.getDrinks());
        System.out.println("*******************");
        System.out.println("Chips: ");
        System.out.println(order.getChips());
        System.out.println("*******************");
        System.out.println("Total: ");
        System.out.println(order.getTotalPrice());

        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        receiptGenerator.writeReceipt(order);

//        if(!sandwiches.isEmpty()) {
//            for(Sandwich sandwich : sandwiches) {
//                double sandwich.getPrice();
//            }
//        }
//        if(!drinks.isEmpty()) {
//            for(Drink drink : drinks) {
//                order.addDrink(drink);
//            }
//        }
//        if(!chips.isEmpty()) {
//            for(Chips chip : chips) {
//                order.addChips(chip);
//            }
//        }
        System.out.println(order.getTotalPrice());

    }
}
