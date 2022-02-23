package com.company;

import java.awt.desktop.SystemEventListener;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome to the Course Registration System");
        System.out.println("Type 1 to Continue or 0 to exit");

        Scanner scan = new Scanner(System.in);

        int choice = scan.nextInt();

        if (choice == 1){

            Student studentOne = new Student();

            studentOne.selectCourse();

        }else{
            System.out.println("The System Will Exit");
        }
    }
}
