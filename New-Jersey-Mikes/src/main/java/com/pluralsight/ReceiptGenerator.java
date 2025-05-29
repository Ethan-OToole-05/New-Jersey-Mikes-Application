package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    private LocalDateTime timestamp;
    private String filePath = "src/main/resources/Receipts";

    public ReceiptGenerator(){

    }

    public void writeReceipt(Order order) {
        // (yyyyMMdd-hhmmss.txt
        //- i.e.
        //20230329-121523.txt
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fileWriter);

        }catch(IOException e) {
            e.printStackTrace();
        }


        //make the writer

        //loop through all the order items and write each item to the receipt

        //Write the total cost

    }

    public String makeTimestamp() {
        //Make time stamp of the current date and time of the order.

        LocalDateTime timestamp = LocalDateTime.now();

        String formattedTimestamp = timestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd|HH:mm:ss"));

        this.timestamp = timestamp;

        return formattedTimestamp;
    }
}
