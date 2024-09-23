package costevalutaion;

public class Car extends Vehicle{

    @Override
    public void print() {
        System.out.println("Car required Successfully. please Pay - "+evaluate());
    }
}
