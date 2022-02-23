package sylvia.yvonne;

import java.util.*;



public class Toyota extends Car{
    String engineType;
    int engineCapacity;

    Scanner engine = new Scanner(System.in);
    Scanner capacity = new Scanner(System.in);

    public void createToyota(){

        System.out.print("Enter the Engine Type: ");
        String engineType = engine.nextLine();

        System.out.print("Enter the Engine Capacity: ");
        int engineCapacity = capacity.nextInt();

        System.out.println("Your Car Details\nEngine Type: " + engineType + "\nEngine Capacity: " + engineCapacity + " Cc\nWheels: " + numberOfWheels + "\nRoof Type: " + roofType);

    }
}
