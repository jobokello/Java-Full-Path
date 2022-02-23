package sylvia.yvonne;

import java.util.Scanner;

public class Tesla extends Car{
    String chargingType;
    int batteryCapacity;

    Scanner charge = new Scanner(System.in);
    Scanner capacity = new Scanner(System.in);

    public void createTesla(){

        System.out.print("Enter the Charge Type: ");
        String chargingType = charge.nextLine();

        System.out.print("Enter the Battery Capacity: ");
        int batteryCapacity = capacity.nextInt();

        System.out.println("Your Car Details\nCharging Type: " + chargingType + "\nBattery Capacity: " + batteryCapacity + " MAh\nWheels: " + numberOfWheels + "\nRoof Type: " + roofType);

    }
}
