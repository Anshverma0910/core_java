package priorityqueue;

public class patient implements Comparable<patient>{
    private String name;
    private int criticality;

    public patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return "patient{" +
                "name='" + name + '\'' +
                ", criticality=" + criticality +
                '}';
    }

    @Override
    public int compareTo(patient o) {
        return Integer.valueOf(this.criticality).compareTo(o.criticality);
    }
}
