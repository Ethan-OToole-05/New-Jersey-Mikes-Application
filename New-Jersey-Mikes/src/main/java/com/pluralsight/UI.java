package com.pluralsight;

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
                //processAddSandwich()
                break;
            case 2:
                //processAddDrink()
                break;
            case 3:
                //processAddChips()
                break;
            case 4:
                //processCheckout()
                break;
            case 0:
                //processCancelOrder()?
                break;
        }
    }

    public static void processAddSandwich(){
        //TODO: NEED BETTER ERROR HANDLING IN THE FUTURE. WRAP ARROUND TRY CATCH BLOCK
        System.out.print("Please select your size: ");
        //TODO: HOW TO DISPLAY THE INCH MARKER WITHOUT CLOSING STRING
        System.out.print("1) Small(4')");
        System.out.print("2) Medium(8')");
        System.out.print("3) Large(12')");
        //int sizeSelection = input.nextInt();
        //WOULD WE NEED A BUNCH OF SWITCH STATEMENTS TO ASSIGN CORRECT PRICE FOR EACH?
        System.out.print("What bread would you like? ");
        System.out.print("1) Small(4')");
        System.out.print("2) Medium(8')");
        System.out.print("3) Large(12')");


    }
    public static void processAddDrink(){

    }
    public static void processAddChips(){

    }
    public static void processCheckout(){

    }

//    public static void processCancelOrder(){
//
//    }
}
