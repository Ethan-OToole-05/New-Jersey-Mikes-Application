package com.pluralsight;

import com.pluralsight.models.Chips;
import com.pluralsight.models.Drink;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    private String timestamp = makeTimestamp();
    private final String filePath = "src/main/resources/Receipts";

    public ReceiptGenerator() {
        //Makes our file directory just in case we don't have the correct filePath first.
        File directory = new File(filePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void writeReceipt(Order order) {

        /*
        -This method will write out receipts depending on what sandwiches, drinks, and chips we have.
        -Checks if we there are an empty lists of sandwiches, drinks, and chips to print out all the correct details.
         */

        String filename = filePath + "/" + makeTimestamp() + ".txt";
        try {
            File receiptFile = new File(filename);
            BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile));

            if (!order.getSandwiches().isEmpty()) {
                for (Sandwich sandwich : order.getSandwiches()) {
                    writer.write("Sandwich: | " + sandwich.toString());
                    writer.newLine();
                }
            }
            if (!order.getDrinks().isEmpty()) {
                for (Drink drink : order.getDrinks()) {
                    writer.write("Drink: | " + drink.toString());
                    writer.newLine();
                }
            }
            if (!order.getChips().isEmpty()) {
                for (Chips chip : order.getChips()) {
                    writer.write("Chips: | " + chip.toString());
                    writer.newLine();
                }
            }
            writer.write("Total: $" + order.getTotalPrice());

            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String makeTimestamp() {

        /*
        -Makes a timestamp from the current time the order took place to write to the receipt file.
         */

        LocalDateTime time = LocalDateTime.now();

        String formattedTimestamp = time.format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss"));

        this.timestamp = formattedTimestamp;

        return formattedTimestamp;
    }
}
