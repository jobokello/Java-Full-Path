package com.company;

import java.util.Scanner;

public class Invoice {
    String invoiceDate = "12/02/2022";
    int docNumber = 1001;
    String description = "invoice for Course 1001";
    int amount = 15000;

    public void getCourseInvoiceData(){
        System.out.println("Invoice Date: " + invoiceDate);
        System.out.println("Invoice Number: " + docNumber);
        System.out.println("Invoice Description: " + description);
        System.out.println("Invoice Amount: " + amount);


        Scanner scan = new Scanner(System.in);

        System.out.println("Press 1 to confirm Payment and receive the payment receipt");

        int confirmPayment = scan.nextInt();

        if (confirmPayment == 1){
            Receipt receiptOne = new Receipt();

            receiptOne.sendReceipt();

        }else {
            return;
        }

    }

}
