public class player {
    private String name;
    private int run =0;

    public String getName() {
        return name;
    }

    public player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public player(String name, int run) {
        this.name = name;
        this.run = run;
    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", run=" + run +
                '}';
    }
}
