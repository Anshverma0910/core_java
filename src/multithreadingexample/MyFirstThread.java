package multithreadingexample;

public class MyFirstThread extends Thread{

    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" is running");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" starts");

        Thread t1 = new MyFirstThread();
        t1.start();
        System.out.println(Thread.currentThread().getName()+" ends");

    }


}
