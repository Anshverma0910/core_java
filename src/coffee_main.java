import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class coffee_main

{
    public static void main(String[] args) {
        ArrayList<coffee> list = new ArrayList<>();
        list.add(new coffee("cafe latte", "Hot Coffe","Dark Brown",100));
        list.add(new coffee("Cappi Nirvana","Cold Coffee","Brown",250));
        list.add(new coffee("Cappucino","Hot Coffee","Dark Brown",100));
        list.add(new coffee("Expresso","Hot Coffee","Black",400));

        Collections.sort(list,new priceComparator());
        System.out.println(list);
    }
}
