package com.company;

import java.util.Scanner;

public class Course {
    int courseID = 1002;
    String courseName = "Object Oriented Programming";
    int courseCost = 15000;

    public void courseDetails(){
        System.out.println("The Course Available is " + courseName + " with the course Code " + courseID + "\n would you like to do it?(Yes(1) or No(0))");
    }

    public void sendCourseDate(int x, String y){
        System.out.println("-----------Accountant Panel-----------");
        System.out.println("The Student " + x + "with ID number: " + y + "want to take the course " + courseName + "\n kindly press 1 to send invoice: ");

        Scanner scan = new Scanner(System.in);

        int courseInvoice = scan.nextInt();

        if (courseInvoice == 1){

            Accountant accountantOne = new Accountant();

            accountantOne.sendInvoiceData();

        }
    }
}
