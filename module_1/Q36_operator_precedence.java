public class Q36_operator_precedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int result1 = a + b * c;
        int result2 = (a + b) * c;
        System.out.println("Without brackets: " + result1);
        System.out.println("With brackets: " + result2);
    }
}