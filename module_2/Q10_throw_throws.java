import java.util.Scanner;
public class Q10_throw_throws {
    static int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Factorial cannot be calculated for a negative number.");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            int result = factorial(num);
            System.out.println("Factorial = " + result);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}