package multithreadingexample;

public class Task1 extends Thread{

    public void run(){

        for(int i=1;i<=10;i++){
            System.out.println("The value is : "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
