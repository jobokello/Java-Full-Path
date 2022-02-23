import java.util.*;

public class Student extends Person {
    String program;

    public void registration() {
        Scanner studentID = new Scanner(System.in);
        Scanner studentname = new Scanner(System.in);
        Scanner studentPostalAddress = new Scanner(System.in);
        Scanner studentStreetAddress = new Scanner(System.in);

        System.out.print("Enter Your ID: ");
        int personID = studentID.nextInt();

        System.out.print("Enter Your Name: ");
        String name = studentname.nextLine();

        System.out.print("Enter Your streetAddress: ");
        String streetAddress = studentStreetAddress.nextLine();

        System.out.print("Enter Your Postal Address: ");
        String postalAddress = studentPostalAddress.nextLine();

        System.out.print("Your ID: " + personID + "\nYour Name: " + name + "\nYour street address: " + streetAddress + "\nYour postal address: " + postalAddress);

    }
}
