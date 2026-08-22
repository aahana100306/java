interface Calculator {
    int compute(int a, int b);
}
public class Q4_calculator_lambda {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Addition: " + add.compute(10, 5));
        System.out.println("Subtraction: " + subtract.compute(10, 5));
        System.out.println("Multiplication: " + multiply.compute(10, 5));
    }
}