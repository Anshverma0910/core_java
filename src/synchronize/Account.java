package synchronize;

import java.sql.SQLOutput;

public class Account {
    int withdrawAmount = 20000;
    int availAmount = 10000;
    public synchronized void withdraw()
    {
        System.out.println("Available Balance : "+ availAmount);
        System.out.println("Going to Withdraw : "+ withdrawAmount);
        while(availAmount < withdrawAmount)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Withdraw Completed  ");
        System.out.println("Remaining amount : "+ (availAmount-withdrawAmount));
    }
    public synchronized void addAmount(int amount)
    {
        System.out.println(Thread.currentThread().getName());
        availAmount+=amount;
        notifyAll();
    }
}
