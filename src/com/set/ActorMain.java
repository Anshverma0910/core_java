package com.set;

import java.util.*;

public class ActorMain {
    public static void main(String[] args) {
    //List<Actor> actors = new ArrayList<>();
    Set<Actor> actors = new TreeSet<>(new ActorComparator());
    actors.add(new Actor("Mohit","Tollywood",4));
    actors.add(new Actor("Himanshu","Bollywood",6));
    actors.add(new Actor("Mohit","Tollywood",4));
    actors.add(new Actor("prem","Hollywood",3));
    actors.add(new Actor("Mohit","Bollywood",9));
    for(Actor a : actors)
    {
        actors.add(a);
    }
    System.out.println(actors);

    // sorting technique for HashSet
    Set<Integer> set = new HashSet<>();
    set.add(10);
    set.add(8);
    set.add(7);
    set.add(20);
    set.add(1);

    List<Integer> list = new ArrayList<>(set);
    Collections.sort(list);
    Set<Integer> tempset = new LinkedHashSet<>(list);
    System.out.println(tempset);

    }
}
