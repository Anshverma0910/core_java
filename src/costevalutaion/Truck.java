package costevalutaion;

public class Truck extends Vehicle{

    @Override
    public void print() {
        System.out.println("Truck required Successfully. please Pay - "+evaluate());
    }
}
