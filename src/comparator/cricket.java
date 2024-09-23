package comparator;

public class cricket {

    private String name;
    private String type;
    private int no_of_runs;
    private int no_of_centuries;
    private int no_of_wickets;
    private int avg;

    public cricket(String name, String type, int no_of_runs, int no_of_centuries, int no_of_wickets) {
        this.name = name;
        this.type = type;
        this.no_of_runs = no_of_runs;
        this.no_of_centuries = no_of_centuries;
        this.no_of_wickets = no_of_wickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNo_of_runs() {
        return no_of_runs;
    }

    public void setNo_of_runs(int no_of_runs) {
        this.no_of_runs = no_of_runs;
    }

    public int getNo_of_centuries() {
        return no_of_centuries;
    }

    public void setNo_of_centuries(int no_of_centuries) {
        this.no_of_centuries = no_of_centuries;
    }

    public int getNo_of_wickets() {
        return no_of_wickets;
    }

    public void setNo_of_wickets(int no_of_wickets) {
        this.no_of_wickets = no_of_wickets;
    }

    public int getAvg() {

        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public cricket(String name, String type, int no_of_runs, int no_of_centuries, int no_of_wickets, int avg) {
        this.name = name;
        this.type = type;
        this.no_of_runs = no_of_runs;
        this.no_of_centuries = no_of_centuries;
        this.no_of_wickets = no_of_wickets;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "cricket{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", no_of_runs=" + no_of_runs +
                ", no_of_centuries=" + no_of_centuries +
                ", no_of_wickets=" + no_of_wickets +
                ", avg=" + avg +
                '}';
    }
}
