import java.util.*;

public class cricket {
    private static String currentTeamArray[] = {"Rohit Sharma","Shubham","Virat","K L Rahul","Pant"};
    private static String reservedPoolArray[] = {"Jiaswal","Abhishek Sharma","Gaikward"};
    private static List<List<String>> playerReplaced = new ArrayList<>();
    private static List<player> currentTeam = new LinkedList<>();
    private static List<player> reservedPool = new ArrayList<>();
    private static int flag=0;
    private static int fl=0;

    public static void addPlayer(){

        // for current team
        for(String name : currentTeamArray){
            player p = new player(name);
            currentTeam.add(p);
        }

        // for reserved pool

        for(String name : reservedPoolArray){
            player p = new player(name);
            reservedPool.add(p);
        }


    }
    public static void print(String title)
    {
        System.out.println("_____" + title + "_____");

        if(fl == 1)
        {
            for (player p : currentTeam) {
                System.out.println("  "+p.getName()+" -> "+p.getRun());
            }
            fl=0;
        }
        else {
            for (player p : currentTeam) {
                System.out.println("  " + p.getName());
            }
        }
        if(flag == 1){
            for(List<String> p : playerReplaced)
            {
                System.out.println(p.get(0)+" replaced by "+p.get(1));
            }
        }
    }

    public static void scoreCard(){
        Random ran = new Random();
        fl=1;
        for(player p : currentTeam)
        {
            int run = ran.nextInt(100);
            p.setRun(run);
        }
    }


    public static void newTeam(){
        for(player p : currentTeam)
        {
            if(p.getRun() < 35)
            {
                List<String> list = new ArrayList<>();
                flag=1;
                player temp = p;
                int index= currentTeam.indexOf(p);
                currentTeam.set(index,reservedPool.get(0));
                list.add(temp.getName());
                list.add(reservedPool.get(0).getName());
                playerReplaced.add(new ArrayList<>(list));
                reservedPool.remove(0);
                reservedPool.add(temp);
            }
        }
    }

    public static void main(String[] args) {
        cricket.addPlayer();
        cricket.print("Current Team");
        cricket.print("Reserved Pool");
        cricket.scoreCard();
        cricket.print("Score Card");
        cricket.newTeam();
        cricket.print("New Current Team");

    }
}
