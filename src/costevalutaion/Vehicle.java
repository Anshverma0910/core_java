package costevalutaion;

import java.util.Random;

public abstract class Vehicle {
    public abstract void print();
    private final int EVALUATION=500;
    Random ran = new Random();
    private int service= ran.nextInt(10000);
    public int evaluate()
    {
        return service+EVALUATION;
    }
}
