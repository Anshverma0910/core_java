package cloneable;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Car tataSafari = new Car("hyndai",10000);
        Car hyndai = (Car)tataSafari.clone();
        System.out.println("Initial : "+tataSafari);
        System.out.println("cloned : " + hyndai);
    }
}
