package Liftexample;

public class Lift {
    private String liftNumber;
    private int floor;

    public Lift(String liftNumber, int floor) {
        this.liftNumber = liftNumber;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "liftNumber=" + liftNumber +
                ", floor=" + floor +
                '}';
    }

    public String getLiftNumber() {
        return liftNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
