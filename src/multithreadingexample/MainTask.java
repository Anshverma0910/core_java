package multithreadingexample;

public class MainTask{

    public static void main(String[] args) {
       Thread t1 = new Task1();
       t1.setDaemon(true);

       t1.start();

        Thread t2 = new Task2();
        t1.setPriority(10);
       t2.start();
    }
}
