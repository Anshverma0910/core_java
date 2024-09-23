package interupted;

public class InteruptedMain implements Runnable{

    @Override
    public synchronized void run() {
        for(int i=1;i<=2;i++)
        {
            if(Thread.interrupted())
            {
                System.out.println(Thread.currentThread().getName()+" interrupted method call");
            }
            else{
                System.out.println(Thread.currentThread().getName()+" is not interrupted method call");
            }
        }
    }
    public static void main(String[] args) {

        Thread t1 = new Thread(new InteruptedMain(),"First Thread");
        Thread t2 = new Thread(new InteruptedMain(),"Second Thread");

        t1.start();
        t1.interrupt();
        t2.start();
    }
}
