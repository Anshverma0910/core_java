package exceptionhandling;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        int age = sc.nextInt();
        person p = new person(name,age);

        if(p.getAge() < 18){
            try{
                throw new NotEligibleException(p.getName()+" is not eligible to vote");
            }
            catch (NotEligibleException e)
            {
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println(p.getName()+" is eligible to vote");
        }

    }
}
