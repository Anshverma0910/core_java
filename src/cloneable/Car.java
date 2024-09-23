package cloneable;

public class Car implements Cloneable{
     private String name;
     private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
