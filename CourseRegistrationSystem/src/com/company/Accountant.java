package com.company;

public class Accountant {
    int accountantID = 111;
    String accountantName = "EnuzAdmin";

    Invoice invoiceOne = new Invoice();

    public void sendInvoiceData(){
        System.out.println("-----------Student Panel-----------");
        System.out.println("Below are the invoice details for the course");

        invoiceOne.getCourseInvoiceData();
    }
}
