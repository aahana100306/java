public class Q25_math_methods {
    public static void main(String[] args) {

        double number = 25;
        double base = 2;
        double exponent = 3;

        int a = -15;
        int b = 20;

        System.out.println("Square root of " + number + ": " + Math.sqrt(number));
        System.out.println(base + " raised to " + exponent + ": " + Math.pow(base, exponent));
        System.out.println("Absolute value of " + a + ": " + Math.abs(a));
        System.out.println("Maximum of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Minimum of " + a + " and " + b + ": " + Math.min(a, b));
    }
}