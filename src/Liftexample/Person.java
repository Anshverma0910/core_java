package Liftexample;

public class Person {
    private String name;
    private int currentFloor;
    private int destinationFloor;

    public Person(String name, int currentFloor, int destinationFloor) {
        this.name = name;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", currentFloor=" + currentFloor +
                ", destinationFloor=" + destinationFloor +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
}
