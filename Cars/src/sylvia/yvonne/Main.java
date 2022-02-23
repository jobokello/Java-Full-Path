package sylvia.yvonne;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner cartype = new Scanner(System.in);

        System.out.print("Which car would you like to create\n\t1. Tesla\n\t2. Toyota\nChoice: ");

        int decision = cartype.nextInt();

        switch(decision){
            case 1:
                Tesla teslaone = new Tesla();
                teslaone.createTesla();
                break;
            case 2:
                Toyota toyotaone = new Toyota();
                toyotaone.createToyota();
                break;
            default:
                System.out.println("Wrong Choice!!!.\nProgram will exit...");
                break;
        }

    }
}
