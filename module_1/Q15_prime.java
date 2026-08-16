public class Q15_prime {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        int i = 2;
        while (i < num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
            }
            i++;
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }