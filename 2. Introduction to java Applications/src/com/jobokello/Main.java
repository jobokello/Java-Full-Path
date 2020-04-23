package com.jobokello;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //variables
        Scanner input = new Scanner(System.in);
        int choice;
        int balance = 5000;
        int withdrawal;
        int deposit;

        //welcome note
        System.out.println("Welcome to the bank");
        //the menu
        System.out.println("Main Menu\n\t1 - View Balance\n\t2 - Withdraw cash\n\t3 - Deposit\n\t4 - Exit");

        //choice
        System.out.print("Enter a Choice: ");

        //choice taken from keyboard
        choice = input.nextInt();

        if (choice == 1)
        {
            System.out.printf("The balance is %d", balance);
        }
        else if (choice == 2)
        {
            //withdrawal prompt
            System.out.print("Enter amount to withdraw: ");

            //withdrawal amount
            withdrawal = input.nextInt();

            balance = balance - withdrawal;

            //new balance
            System.out.printf("new balance balance is %d", balance);
        }
        else if (choice == 3)
        {
            //Deposit prompt
            System.out.print("Enter amount to deposit: ");

            //withdrawal amount
            deposit = input.nextInt();

            balance = balance + deposit;

            //new balance
            System.out.printf("new balance balance is %d", balance);
        }
        else if (choice == 4)
        {
            //withdrawal prompt
            System.out.print("Enter a to withdraw: ");

            //withdrawal amount
            withdrawal = input.nextInt();

            balance = balance - withdrawal;

            //new balance
            System.out.println("GOOD BYE");
        }


    }//end of main
}
