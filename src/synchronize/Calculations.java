package synchronize;

public class Calculations {
    TwoNumbers twoNumbers;

    public Calculations(TwoNumbers twoNumbers) {
        this.twoNumbers = twoNumbers;
    }

    public void addition()
    {
        System.out.println("Addition of two numbers are "+(twoNumbers.getFirstNumber()+twoNumbers.getSecondNumber())+" done by thread : "+Thread.currentThread().getName());
    }
    public synchronized void subtration()
    {
        System.out.println("Subtration of two numbers are "+(twoNumbers.getFirstNumber()-twoNumbers.getSecondNumber())+" done by thread : "+Thread.currentThread().getName());
    }
    public synchronized void multiplication()
    {
        System.out.println("Multiplication of two numbers are "+(twoNumbers.getFirstNumber()*twoNumbers.getSecondNumber())+" done by thread : "+Thread.currentThread().getName());
    }
    public synchronized void division()
    {
        System.out.println("Division of two numbers are "+(twoNumbers.getFirstNumber()/twoNumbers.getSecondNumber())+" done by thread : "+Thread.currentThread().getName());
    }
}
