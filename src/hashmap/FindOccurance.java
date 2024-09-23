package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindOccurance {
    public static Character occurrance(String name){

        HashMap<Character,Integer> newMap = new LinkedHashMap<>();
        char arr[] = name.toCharArray();

        for(char ch : arr){
            newMap.put(ch,newMap.getOrDefault(ch,0)+1);
        }

        int flag = 1;
        for(Character ch : newMap.keySet())
        {
            if(newMap.get(ch) ==  1){
                if(flag == 0) return ch;
                flag--;
            }
        }
        return 0;
    }
}
