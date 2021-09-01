package Lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(10);
        Calculator calculator2 = new Calculator(2);
        Calculator calc1 = calculator1.add(calculator2);
        Calculator calc2 = calculator1.sub(calculator2);
        Calculator calc3 = calculator1.multiply(calculator2);
        Calculator calc4 = calculator1.div(calculator2);

        System.out.println(calc1.getValue());
        System.out.println(calc2.getValue());
        System.out.println(calc3.getValue());
        System.out.println(calc4.getValue());

    }
}
