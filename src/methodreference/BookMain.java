package methodreference;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookMain{

    public static void print(Book book)
    {
        System.out.println(book);
    }

    public static int consonent(String s)
    {
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!set.contains(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        int count=0;
        for(Character i : map.keySet()){
            if(map.get(i) == 1) count++;
        }
        return count;
    }
    public static int numberOfConsonents(String s)
    {
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!set.contains(c)) count++;
        }
        return count;
    }
    public static void main(String[] args) {

        List<Book> list = new ArrayList<Book>();
        list.add(new Book("qwertyui",500));
        list.add(new Book("Casdfghjk",700));
        list.add(new Book("Szxcvbn",1000));
        list.add(new Book("Szxbnm",1500));

        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');


        list.forEach(e ->{
            BookInterface obj = BookMain :: numberOfConsonents;
            System.out.println(e.getName()+" - "+obj.numberOfConsonents(e.getName()));
        });

        Stream<Book> stream = list.stream();
        List<Integer> newList = stream.
                filter(e -> consonent(e.getName()) > 5).
                map(e->consonent(e.getName())).
                collect(Collectors.toList());

        System.out.println(newList.toString());


    }
}
