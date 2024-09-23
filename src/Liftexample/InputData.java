package Liftexample;

import java.util.*;
import java.util.Scanner;

public class InputData {

    public static Person inputUserDetails(Scanner sc) {
        // Input user details
        System.out.println("Enter your Name : ");
        String name=sc.nextLine();

        System.out.println("Enter your current floor : ");
        int currentFloor = sc.nextInt();

        System.out.println("Enter the floor where you want to go : ");
        int destinationFloor = sc.nextInt();

        return new Person(name,currentFloor,destinationFloor);

    }
    // Input lifts details
    public static List<Lift> inputLiftDetails(Scanner sc)
    {
        System.out.println("Enter the Number of Lifts : ");
        int number = sc.nextInt();
        List<Lift> lifts = new ArrayList<>();
        for(int i=1;i<=number;i++)
        {
            System.out.println("Current floor of Lift "+i);
            int floor = sc.nextInt();
            Lift obj = new Lift(("L"+i),floor);
            lifts.add(obj);
        }
        return lifts;
    }
}
