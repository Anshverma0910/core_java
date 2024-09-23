package synchronize;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Thread withdraw = new Thread(){
            public void run()
            {
                account.withdraw();

            }
        };
        Thread mahesh = new Thread("Thread-1"){
            public void run()
            {
                account.addAmount(3000);
                System.out.println("Mahesh added : 3000");
            }
        };
        Thread sunil = new Thread("Thread-2"){
            public void run()
            {
                account.addAmount(9000);
                System.out.println("sunil added : 9000");
            }
        };
        withdraw.start();
        mahesh.start();
        sunil.start();

    }
}
