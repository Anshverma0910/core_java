package Liftexample;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean newFloor = true;

        Person person = InputData.inputUserDetails(sc);
        List<Lift> lifts = InputData.inputLiftDetails(sc);

        while(newFloor)
        {
            Lift lift = Service.nearestLift(person.getCurrentFloor(),lifts);
            Service.printLiftToCurrentFloor(person,lift);
            newFloor = Service.printLiftToDestinationFloor(sc,person,lift);
        }
    }
}
