package synchronize;

public class Main {
    public static void main(String[] args) {

        Task taskObj = new Task();
        Thread t1 = new Thread(taskObj);
        Thread t2 = new Thread(taskObj);
        Thread t3 = new Thread(taskObj);


        t1.start();
        t2.start();
        t3.start();
    }
}
