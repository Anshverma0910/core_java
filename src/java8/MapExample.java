package java8;

import java.util.HashMap;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,Singer> map = new LinkedHashMap<>();
        map.put(10,new Singer("Ansh","Bollywood"));
        map.put(20,new Singer("Shubham","Bollywood"));
        map.put(30,new Singer("Ravi","Bollywood"));
        map.put(40,new Singer("Ritu","Bollywood"));

        List<Map.Entry<Integer,Singer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b) -> a.getValue().getName().compareTo(b.getValue().getName()));


        Map<Integer,Singer> newMap = new LinkedHashMap<>();
        list.forEach(e -> {
            newMap.put(e.getKey(),e.getValue());
        });


        newMap.entrySet().forEach(e -> System.out.println(e));
    }
}
