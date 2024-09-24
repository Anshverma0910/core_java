package java8;

import java.util.Comparator;
import java.util.Map.*;

public class SortSinger implements Comparator<Entry<Integer,Singer>> {

    @Override
    public int compare(Entry<Integer, Singer> o1, Entry<Integer, Singer> o2) {
        return o1.getValue().getName().compareTo(o2.getValue().getName());
    }
}
