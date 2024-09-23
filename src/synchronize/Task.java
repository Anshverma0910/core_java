package synchronize;

public class Task implements Runnable{

    @Override
    public void run(){
        TwoNumbers obj = new TwoNumbers(20,10);

        Calculations calc = new Calculations(obj);
        calc.addition();
        calc.subtration();
        calc.multiplication();
        calc.division();


    }

}
