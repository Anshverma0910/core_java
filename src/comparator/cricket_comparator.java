package comparator;

import java.util.Comparator;

public class cricket_comparator implements Comparator<cricket> {
    private  int flag=1;
    @Override
    public  int compare(cricket c1, cricket c2) {

        if(flag == 1) {
            flag++;
            Integer.valueOf(c1.getNo_of_centuries()).compareTo(c2.getNo_of_centuries());
        }
        if(flag == 2) {
            flag++;
            Integer.valueOf(c1.getNo_of_runs()).compareTo(c2.getNo_of_runs());
        }
        if(flag == 3) {
            flag++;
            Integer.valueOf(c1.getNo_of_wickets()).compareTo(c2.getNo_of_wickets());
        }
        if(flag == 4) {
            flag++;
            return Integer.valueOf(c1.getAvg()).compareTo(c2.getAvg());
        }

        return 0;
    }
}
