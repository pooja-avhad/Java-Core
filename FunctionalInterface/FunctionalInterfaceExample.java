@FunctionalInterface
interface MyCalculator
{
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample
{
    public static void main(String[] args)
    {
        MyCalculator addition = (a, b) -> a + b;
        MyCalculator multiplication = (a, b) -> a * b;

        System.out.println(addition.calculate(4, 5));
        System.out.println(multiplication.calculate(4, 5));
    }
}