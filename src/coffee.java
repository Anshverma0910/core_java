public class coffee implements Comparable<coffee>
{
    private String name;
    private String type;
    private String color;
    private int price;

    public coffee(String name, String type, String color, int price) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "coffee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(coffee c){
        Integer value=Integer.valueOf(this.price);
        return value.compareTo(c.price);
    }
}
