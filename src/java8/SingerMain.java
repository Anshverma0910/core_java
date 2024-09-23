package java8;

import java.util.*;

public class SingerMain {
    public static void main(String[] args) {
        List<Singer> list = new ArrayList<>();
        list.add(new Singer("Mohit","Sad"));
        list.add(new Singer("Vishal","Romantic"));
        list.add(new Singer("Himanshu","Haryanvi"));
        list.add(new Singer("Prem","Energetic"));

        list.forEach(e -> System.out.println(e));
        Collections.sort(list,(s1,s2)-> s1.getName().compareTo(s2.getName()));


    }
}
