package java8;

public class CalculationMain {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        Calculate2 add = (a,b) -> {
            System.out.println(a+b);
        };
        add.calc(firstNumber,secondNumber);

        Calculation sub = (a,b) -> (a-b);
        int number = sub.calc(firstNumber,secondNumber);

        Calculation div = (a,b) -> (a/b);
        int divNumber = div.calc(firstNumber,secondNumber);

        Calculate2 mul = (a,b) -> {
            System.out.println(a*b);
        };
        mul.calc(firstNumber,secondNumber);

    }
}
