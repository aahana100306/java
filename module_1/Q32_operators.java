public class Q32_operators {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
  
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println("\nLogical Operators");
        System.out.println((a > b) && (b > 0));
        System.out.println((a < b) || (b > 0));
        System.out.println(!(a == b));
    }
}