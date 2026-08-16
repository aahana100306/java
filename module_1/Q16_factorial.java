public class Q16_factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = fact(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}