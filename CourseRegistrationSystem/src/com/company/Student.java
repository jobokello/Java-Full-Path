package com.company;

import java.util.Scanner;

public class Student {
    int studentID;
    String studentName;
    int courseID;
    String courseName;

    Scanner scan = new Scanner(System.in);
    Scanner scanStudentID = new Scanner(System.in);
    Scanner scanStudentName = new Scanner(System.in);

    public void selectCourse(){
        System.out.print("Enter your Student ID: ");
        int studentID = scanStudentID.nextInt();
        System.out.println(studentID);

        System.out.print("Enter your Name: ");
        String studentName = scanStudentName.nextLine();
        System.out.println(studentName);

        Course courseOne = new Course();

        courseOne.courseDetails();

        int confirmCourse = scan.nextInt();

        if (confirmCourse == 1){
            courseOne.sendCourseDate(studentID,studentName);
        }else{
            return;
        }

    }
}
