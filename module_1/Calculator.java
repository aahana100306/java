public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 2));
        System.out.println(calc.subtract(5, 2));
        System.out.println(calc.multiply(5, 2));
        System.out.println(calc.divide(5, 2));
}}