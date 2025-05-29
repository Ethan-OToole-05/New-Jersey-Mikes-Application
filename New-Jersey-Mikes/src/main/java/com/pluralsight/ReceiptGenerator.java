package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    private String timestamp = makeTimestamp();
    private final String filePath = "src/main/resources/Receipts";

    public ReceiptGenerator(){
        File directory = new File(filePath);
        if(!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void writeReceipt(Order order) {

        String filename = filePath + "/" + makeTimestamp() + ".txt";
        // (yyyyMMdd-hhmmss.txt
        //- i.e.
        //20230329-121523.txt
        try{
            File receiptFile = new File(filename);
            BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile));

            if(!order.getSandwiches().isEmpty()) {
                for(Sandwich sandwich : order.getSandwiches()) {
                    writer.write(sandwich.toString());
                    writer.newLine();
                }
            }
            if(!order.getDrinks().isEmpty()) {
                for(Drink drink : order.getDrinks()) {
                    writer.write(drink.toString());
                    writer.newLine();
                }
            }
            if(!order.getChips().isEmpty()) {
                for(Chips chip : order.getChips()) {
                    writer.write(chip.toString());
                    writer.newLine();
                }
            }
            writer.write("Total: $" + order.getTotalPrice());

            writer.close();


        }catch(IOException e) {
            e.printStackTrace();
        }


        //make the writer

        //loop through all the order items and write each item to the receipt

        //Write the total cost

    }

    public String makeTimestamp() {
        //Make time stamp of the current date and time of the order.

        LocalDateTime time = LocalDateTime.now();

        String formattedTimestamp = time.format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss"));

        this.timestamp = formattedTimestamp;

        return formattedTimestamp;
    }
}
