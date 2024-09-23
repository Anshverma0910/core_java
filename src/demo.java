import java.util.*;
import java.util.Random;


public class demo {
    public static void main(String[] args) {
//        List<student> list = new ArrayList<>();
//        List<String> arr = new ArrayList<>();
//        arr.add("ansh");
//        arr.add("mohit");
//        arr.add("prem");
//        Random ran = new Random();
//        for(String i : arr){
//            int num=ran.nextInt(100);
//            student obj = new student(num,i);
//            list.add(obj);
//        }
//        System.out.println(list.get(0).getName());


        Stack<Integer> stack = new Stack<>();
        stack.push(221);
        stack.push(107);
        stack.push(111);
        stack.push(103);
        stack.push(101);



        for(Integer i : stack){
            System.out.println(i);
        }
        System.out.println(stack.search(103));
        System.out.println(stack.indexOf(107));
        System.out.println("Jai Shree Ram");
    }
}
