package hashmap;

import java.util.Scanner;

public class FindOccuranceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.print(FindOccurance.occurrance(name));
    }
}
