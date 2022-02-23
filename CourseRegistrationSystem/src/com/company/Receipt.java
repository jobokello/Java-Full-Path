package com.company;

public class Receipt {
    String receiptDate = "12/02/2022";
    int docNumber = 1001;
    String description = "Receipt for Course 1001";
    int amount = 15000;

    public void sendReceipt(){
        System.out.println("Below are the receipt details for the course payment");
        System.out.println("receipt Date: " + receiptDate);
        System.out.println("receipt Number: " + docNumber);
        System.out.println("receipt Description: " + description);
        System.out.println("receipt Amount: " + amount);
    }
}
