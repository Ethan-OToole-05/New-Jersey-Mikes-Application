package com.pluralsight;

import com.pluralsight.models.*;
import com.pluralsight.util.SandwichHelper;

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
                    System.out.println("What sandwich would you like? :");
                    System.out.println("1) BLT");
                    System.out.println("2) Philly Cheese Steak");
                    System.out.println("3) Custom made");
                    int sandwichSelection = input.nextInt();
                    input.nextLine();

                    switch (sandwichSelection) {
                        case 1 -> processAddSandwich(new BLT());
                        case 2 -> processAddSandwich(new PhillyCheeseSteak());
                        case 3 -> processAddSandwich(new Sandwich());
                    }
                    break;
                case 2:
                    processAddDrink();
                    break;
                case 3:
                    processAddChips();
                    break;
                case 4:
                    processCheckout();
                    return;
                case 0:
                    System.out.println("Order has been canceled.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again");
            }
        }
    }

    public static void processAddSandwich(Sandwich sandwich) {

        /*
        -The first process of adding a message is to check if it is a BLT or Philly Cheese Steak.
        -If not then we know it's a custom sandwich to build.
         */
        boolean continueAnswer = true;
        if (sandwich instanceof BLT) {
            System.out.println("Would you like to customize your BLT? (Y/N) ");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                sandwich.calculateTotal();
                order.addSandwich(sandwich);
                System.out.println("Your sandwich has been added to the order.");
                return;
            }
        }
        if (sandwich instanceof PhillyCheeseSteak) {
            System.out.println("Would you like to customize your Philly Cheese Steak? (Y/N) ");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                sandwich.calculateTotal();
                order.addSandwich(sandwich);
                System.out.println("Your sandwich has been added to the order.");
                return;
            }
        }

        //TODO: NEED BETTER ERROR HANDLING IN THE FUTURE. WRAP ARROUND TRY CATCH BLOCK
        System.out.println("What size sandwich would you like? ");

        for (int i = 0; i < SandwichHelper.sizes.length; i++) {
            System.out.printf("%d) %s\n", i + 1, SandwichHelper.sizes[i]);
        }

        System.out.print("Selection: ");
        int sizeSelection = input.nextInt();
        while(true) {
            switch (sizeSelection) {
                //TODO ERROR HANDLE BETTER
                case 1 -> sandwich.setSize("Small");
                case 2 -> sandwich.setSize("Medium");
                case 3 -> sandwich.setSize("Large");
                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }
            }
            break;
        }
        input.nextLine();

        //WOULD WE NEED A BUNCH OF SWITCH STATEMENTS TO ASSIGN CORRECT PRICE FOR EACH?
        System.out.println("What bread would you like? ");
        for (int i = 0; i < SandwichHelper.bread.length; i++) {
            System.out.printf("%d) %s\n", i + 1, SandwichHelper.bread[i]);
        }
        System.out.print("Selection: ");
        int breadSelection = input.nextInt();
        while(true){
            switch (breadSelection) {
                //TODO ERROR HANDLE BETTER
                case 1 -> sandwich.setBread("White");
                case 2 -> sandwich.setBread("Wheat");
                case 3 -> sandwich.setBread("Rye");
                case 4 -> sandwich.setBread("Wrap");
                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }
            }
            break;
        }

        continueAnswer = true;
        while (continueAnswer) {
            if (!sandwich.getMeat().isEmpty()) {
                System.out.println("Would you like extra meat? (Y/N)");
                System.out.print("Selection: ");
                String answer = input.nextLine().toUpperCase();
                if (!answer.equals("Y")) {
                    continueAnswer = false;
                    continue;
                }
            }
            System.out.println("What kind of meat would you like? ");

            for (int i = 0; i < SandwichHelper.meats.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.meats[i]);
            }

            System.out.print("Selection: ");

            int meatSelection = input.nextInt();
            switch (meatSelection) {
                //TODO ERROR HANDLE BETTER
                case 1 -> sandwich.addMeat("Steak");
                case 2 -> sandwich.addMeat("Ham");
                case 3 -> sandwich.addMeat("Salami");
                case 4 -> sandwich.addMeat("Roast Beef");
                case 5 -> sandwich.addMeat("Chicken");
                case 6 -> sandwich.addMeat("Bacon");
                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }
            }
            input.nextLine();
            System.out.println("Would you like extra meat? (Y/N)");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                continueAnswer = false;
                continue;
            }
        }

        continueAnswer = true;
        while (continueAnswer) {
            if (!sandwich.getCheese().isEmpty()) {
                System.out.println("Would you like extra cheese? (Y/N)");
                System.out.print("Selection: ");
                String answer = input.nextLine().toUpperCase();
                if (!answer.equals("Y")) {
                    continueAnswer = false;
                    continue;
                }
            }
            System.out.println("What kind of cheese would you like? ");
            for (int i = 0; i < SandwichHelper.cheese.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.cheese[i]);
            }
            System.out.println("0) None"); //HANDLE LATER
            System.out.print("Selection: ");
            int cheeseSelection = input.nextInt();
            switch (cheeseSelection) {
                //TODO ERROR HANDLE BETTER
                case 1 -> sandwich.addCheese("American");
                case 2 -> sandwich.addCheese("Provolone");
                case 3 -> sandwich.addCheese("Cheddar");
                case 4 -> sandwich.addCheese("Swiss");
                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }
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
            if (!sandwich.getCheese().isEmpty()) {
                System.out.println("Would you like an extra topping? (Y/N)");
                System.out.print("Selection: ");
                String answer = input.nextLine().toUpperCase();
                if (!answer.equals("Y")) {
                    continueAnswer = false;
                    continue;
                }
            }
            System.out.println("Would you like any toppings? ");
            for (int i = 0; i < SandwichHelper.regularToppings.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.regularToppings[i]);
            }
            System.out.print("Selection: ");
            int toppingSelection = input.nextInt();
            switch (toppingSelection) {
                //TODO ERROR HANDLE BETTER
                case 1 -> sandwich.addToppings("Lettuce");
                case 2 -> sandwich.addToppings("Peppers");
                case 3 -> sandwich.addToppings("Onions");
                case 4 -> sandwich.addToppings("Tomatoes");
                case 5 -> sandwich.addToppings("Jalapenos");
                case 6 -> sandwich.addToppings("Cucumbers");
                case 7 -> sandwich.addToppings("Pickles");
                case 8 -> sandwich.addToppings("Guacamole");
                case 9 -> sandwich.addToppings("Mushrooms");
                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }

            }
            input.nextLine();
            System.out.println("Would you like an extra topping?");
            System.out.print("Selection: ");
            String answer = input.nextLine().toUpperCase();
            if (!answer.equals("Y")) {
                continueAnswer = false;
                continue;
            }
        }

        continueAnswer = true;
        while (continueAnswer) {
            if (!sandwich.getCheese().isEmpty()) {
                System.out.println("Would you like more sauce? (Y/N)");
                System.out.print("Selection: ");
                String answer = input.nextLine().toUpperCase();
                if (!answer.equals("Y")) {
                    continueAnswer = false;
                    continue;
                }
            }
            System.out.println("What kind of sauce would you like? ");
            for (int i = 0; i < SandwichHelper.sauces.length; i++) {
                System.out.printf("%d) %s\n", i + 1, SandwichHelper.sauces[i]);
            }
            System.out.println("0) None"); //HANDLE LATER
            System.out.print("Selection: ");
            int sauceSelection = input.nextInt();
            switch (sauceSelection) {
                //TODO ERROR HANDLE BETTER
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
        while(true) {
            switch (sideSelection) {
                //TODO ERROR HANDLE BETTER

                case 0 -> System.out.println("No side selected");
                case 1 -> sandwich.addSide("Au Jus");
                case 2 -> sandwich.addSide("Sauce");
                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }
            }
            break;
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
        order.addSandwich(sandwich);

        System.out.println("Your sandwich is added to the order anything else? ");    }

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
            //TODO ERROR HANDLE BETTER

            case 1 -> drink.setSize("Small");
            case 2 -> drink.setSize("Medium");
            case 3 -> drink.setSize("Large");
            default -> System.out.println("Invalid selection. Please try again.");
        }
        if (drink.getSize() == null) {
            return;
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
            //TODO ERROR HANDLE BETTER

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

        if (drink.getFlavor() == null) {
            return;
        }

        drink.calculateTotal();

        order.addDrink(drink);
        System.out.println("Your drink is added to the order anything else? ");

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
            //TODO ERROR HANDLE BETTER

            case 1 -> selectionChips.setNameBrand("Doritos");
            case 2 -> selectionChips.setNameBrand("Lays");
            default -> System.out.println("Invalid selection. Please try again.");
        }

        if (selectionChips.getNameBrand() == null) {
            return;
        }

        selectionChips.calculateTotal();
        order.addChips(selectionChips);

        System.out.println("Your chips is added to the order anything else? ");

    }

    public static void processCheckout() {
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        if (order.getTotalPrice() == 0) {
            System.out.println("You need to order something first");
            return;
        }
        System.out.println("*******************");
        System.out.println("Order Details");
        System.out.println("*******************");

        if (!order.getSandwiches().isEmpty()) {
            System.out.println("Sandwiches:");
            for (Sandwich sandwich : order.getSandwiches()) {
                System.out.println(sandwich);
                System.out.println();
            }
        } else {
            System.out.println("No sandwiches.");
        }
        if (!order.getDrinks().isEmpty()) {
            System.out.println("Drinks:");
            for (Drink drink : order.getDrinks()) {
                System.out.println(drink);
                System.out.println();
            }
        } else {
            System.out.println("No drinks.");
        }
        if (!order.getChips().isEmpty()) {
            System.out.println("Sandwiches:");
            for (Chips chips : order.getChips()) {
                System.out.println(chips);
                System.out.println();
            }
        } else {
            System.out.println("No chips.");
        }

        System.out.println("Your Total is: $" + order.getTotalPrice());

        System.out.println("Please confirm if the information is correct. ");
        System.out.println("1) Confirm");
        System.out.println("0) Cancel");
        System.out.print("Selection: ");
        int confirmationSelection = input.nextInt();
        input.nextLine();
        switch (confirmationSelection) {
            //TODO ERROR HANDLE BETTER

            case 0 -> System.out.println("Order canceled. Was there something else you wanted?");
            case 1 ->  {
                receiptGenerator.writeReceipt(order);
                System.out.println("Thank you! Have a nice day!");
            }
            default -> System.out.println("Invalid selection. Please try again.");
        }
    }
}
