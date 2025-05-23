package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class UI {
    static Scanner input = new Scanner(System.in);

    public static void display() {
        System.out.println("*******************");
        System.out.println("Welcome to the NEW Jersey Mike's!");
        System.out.println("*******************");
        while (true) {
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
        HashMap<Integer, String> sizeItems = new HashMap<>();
//        sizeItems.put(1, )
        //TODO: NEED BETTER ERROR HANDLING IN THE FUTURE. WRAP ARROUND TRY CATCH BLOCK
        System.out.println("What size sandwich would you like? ");
        //TODO: HOW TO DISPLAY THE INCH MARKER WITHOUT CLOSING STRING
        System.out.println("1) Small(4')");
        System.out.println("2) Medium(8')");
        System.out.println("3) Large(12')");
        System.out.print("Selection: ");
        int sizeSelection = input.nextInt();
        input.nextLine();

        //WOULD WE NEED A BUNCH OF SWITCH STATEMENTS TO ASSIGN CORRECT PRICE FOR EACH?
        System.out.println("What bread would you like? ");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Selection: ");
        int breadSelection = input.nextInt();
        input.nextLine();


        System.out.println("What kind of meat would you like? ");
        System.out.println("1) Steak");
        System.out.println("2) Ham");
        System.out.println("3) Salami");
        System.out.println("4) Roast Beef");
        System.out.println("5) Chicken");
        System.out.println("6) Bacon");
        System.out.println("0) None"); //HANDLE LATER
        System.out.print("Selection: ");
//        System.out.println("Would you like extra?"); //TODO: NEED TO ADD OPTION FOR LATER.
        int meatSelection = input.nextInt();
        input.nextLine();

        System.out.println("What kind of cheese would you like? ");
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
        System.out.println("0) None"); //HANDLE LATER
        System.out.print("Selection: ");
        int cheeseSelection = input.nextInt();
//        System.out.println("Would you like extra?"); //TODO: NEED TO ADD OPTION FOR LATER.
        input.nextLine();

        System.out.println("Would you like any toppings? ");
        System.out.println("1) Lettuce");
        System.out.println("2) Peppers");
        System.out.println("3) Onions");
        System.out.println("4) Tomatoes");
        System.out.println("5) Jalapenos"); //How to add a spanish n
        System.out.println("6) Cucumbers");
        System.out.println("7) Pickles");
        System.out.println("8) Guacamole");
        System.out.println("9) Mushrooms");
        System.out.println("0) None"); //HANDLE LATER
        System.out.print("Selection: ");
//        System.out.println("Would you like extra?"); //TODO: NEED TO ADD OPTION FOR LATER.
        int toppingSelection = input.nextInt();
        input.nextLine();

        System.out.println("What kind of sauce would you like? ");
        System.out.println("1) Mayo");
        System.out.println("2) Mustard");
        System.out.println("3) Ketchup");
        System.out.println("4) Ranch");
        System.out.println("5) Thousand Islands");
        System.out.println("6) Vinaigrette");
        System.out.println("0) None"); //HANDLE LATER
        System.out.print("Selection: ");
        int sauceSelection = input.nextInt();
        input.nextLine();

        System.out.println("Would you like a side?  ");
        System.out.println("1) au jus");
        System.out.println("2) sauce");
        System.out.println("0) none");
        System.out.print("Selection: ");
        int sideSelection = input.nextInt();
        input.nextLine();

        System.out.println("Would you like it toasted? (Y/N)");
        System.out.print("Selection: ");
        String toastedStatus = input.nextLine().toUpperCase();
        //if(toastedStatus.equals("Y") {
        //boolean status = true;
        //}

        //MAKE SANDWICH
        //POSSIBLE EX: Sandwich sandwich = new Sandwich(size, bread, meat, cheese, toppings, sauces, side, toasted).

        System.out.println("Your sandwich is added to the order anything else? ");


    }

    public static void processAddDrink() {
        System.out.println("What size drink would you like? ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.println("0) None"); //DO WE NEED THIS IF THEY KNOW THEY WANT A DRINK?
        System.out.print("Selection: ");
        //int drinkSizeSelection = input.nextInt();

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
        //int flavorSelection = input.nextInt();
        //input.nextLine();

        //TODO: ADD THE DRINK INTO AN OBJECT.
        //POSSIBLE EX: Drink drink = new Drink(Size, Flavor)


        System.out.println("Your drink is added to the order anything else? ");
        return;

    }

    public static void processAddChips() {
        System.out.println("What chips would you like? ");
        System.out.println("1) Doritos");
        System.out.println("2) Lays");
        System.out.println("0) None"); //DO WE NEED THIS IF THEY KNOW THEY WANT A DRINK?
        System.out.print("Selection: ");
        //int chipsSelection = input.nextInt();
        //input.nextLine();

        //TODO:ADD THE CHIPS INTO AN OBJECT.

        System.out.println("Your chips is added to the order anything else? ");

    }

    public static void processCheckout() {
        //TODO: NEED TO DISPLAY ALL ORDER DETAILS (SANDWICH, DRINK, CHIPS).
    }

//    public static void processCancelOrder(){
//
//    }
}
