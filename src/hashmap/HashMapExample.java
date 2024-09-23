package hashmap;

import javax.print.attribute.HashAttributeSet;
import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(10,"Ansh");
        map.put(11,"himanshu");
        map.put(12,"prem");
        map.put(13,"mohit");
        map.put(14,"abhishek");

        // using entry set
        Set<Entry<Integer,String>> set = map.entrySet();

            // using for each
            for(Entry<Integer,String> i : map.entrySet())
            {
                System.out.println(i.getKey()+" : "+i.getValue());
            }

            //

        // using keySet
        for(Integer i : map.keySet())
        {
            System.out.println(i+" "+map.get(i));

        }




    }
}
