package Liftexample;

import java.util.List;
import java.util.Scanner;

public class Service {

    public static Lift nearestLift(int currentFloor,List<Lift> list)
    {
        Lift obj = null;
        int minDistance=Integer.MAX_VALUE;
        for(Lift i : list)
        {
            int min=Math.abs(currentFloor-i.getFloor());
            if(minDistance >= min)
            {
                minDistance=min;
                obj = i;
            }
        }
        return obj;
    }

    public static void printLiftToCurrentFloor(Person person, Lift lift)
    {
        System.out.println(lift.getLiftNumber()+" is the nearest Lift, currently at the floor "+lift.getFloor());
        System.out.println("Please wait. It will arrive soon....");
        if(person.getCurrentFloor() < lift.getFloor())
        {
            for(int i= lift.getFloor();i >= person.getCurrentFloor();i--)
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("\u2193 Floor "+i);
                lift.setFloor(i);
            }
        }
        else{
            for(int i = lift.getFloor();i <= person.getCurrentFloor();i++)
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("\u2191 Floor "+i);
                lift.setFloor(i);
            }
        }

    }

    public static boolean printLiftToDestinationFloor(Scanner sc, Person person, Lift lift) {
        System.out.println("The Lift has arrived. Please get inside and stay away from the door");
        System.out.println("The door are closing now....");
        if (person.getDestinationFloor() < lift.getFloor()) {
            for (int i = lift.getFloor(); i >= person.getDestinationFloor(); i--) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("\u2193 Floor " + i);
                lift.setFloor(i);
            }
        } else {
            for (int i = lift.getFloor(); i <= person.getDestinationFloor(); i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("\u2191 Floor " + i);
                lift.setFloor(i);
            }
        }

        // want to reenter the floor

        System.out.println("Your floor arrived. Thank you for using the lift....");
        System.out.println("To continue, enter Y otherwise N");
        String response = sc.next().toUpperCase();
        if (response.charAt(0) == 'N') {
            return false;
        } else {
            System.out.println("Enter your current floor : ");
            int currentFloor = sc.nextInt();
            System.out.println("Enter the floor where you want to go : ");
            int destinationFloor = sc.nextInt();
            person.setCurrentFloor(currentFloor);
            person.setDestinationFloor(destinationFloor);
            return true;
        }
    }
}
