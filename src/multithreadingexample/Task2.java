package multithreadingexample;

public class Task2 extends Thread{

    public void run(){
        for(int i=100;i<=110;i++){
            System.out.println("The value is : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
