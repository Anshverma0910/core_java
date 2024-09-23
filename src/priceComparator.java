import java.util.Comparator;

public class priceComparator implements Comparator<coffee>
{
    @Override
    public int compare(coffee c1, coffee c2) {
        return Integer.valueOf(c1.getPrice()).compareTo(c2.getPrice());
    }
}
