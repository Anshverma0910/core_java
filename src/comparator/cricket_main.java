package comparator;

import java.util.*;

public class cricket_main {
    public static void main(String[] args) {
    List<cricket> cricket_object = new ArrayList<>();
    cricket_object.add(new cricket("Virat","Batsman",51,5,10, 50));
    cricket_object.add(new cricket("Dhoni","All Rounder",100,10,8,56));
    cricket_object.add(new cricket("Jadeja","Batsman",10,7,4,10));
    cricket_object.add(new cricket("Sachin","All Rounder",151,19,2,10));
    cricket_object.add(new cricket("Rohit Sharma","Bowler",10,1,16,29));

    Collections.sort(cricket_object,new cricket_comparator());
    System.out.println(cricket_object);
    }
}
