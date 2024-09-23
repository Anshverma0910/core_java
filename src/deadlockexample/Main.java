package deadlockexample;

public class Main {
    public static void main(String[] args) {
        String obj1 = "abc";
        String obj2 = "def";

        Thread t1 = new Thread("Thread-1"){
            public void run()
            {
                synchronized (obj1)
                {
                    System.out.println(Thread.currentThread().getName()+" has acquired on obj1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (obj2)
                {
                    System.out.println(Thread.currentThread().getName()+" has acquired on obj2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t2 = new Thread("Thread-1"){
            public void run()
            {
                synchronized (obj1)
                {
                    System.out.println(Thread.currentThread().getName()+" has acquired on obj1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (obj2)
                {
                    System.out.println(Thread.currentThread().getName()+" has acquired on obj2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
