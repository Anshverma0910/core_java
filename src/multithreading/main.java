package multithreading;

public class main {
    public static void main(String[] args) {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName);
    }
}
