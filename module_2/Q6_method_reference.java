interface Square {
    int calculate(int n);
}

class NumberOperations {
    static int findSquare(int n) {
        return n * n;
    }
}

public class Q6_method_reference {
    public static void main(String[] args) {
        Square s = NumberOperations::findSquare;
        int number = 7;
        System.out.println("Number: " + number);
        System.out.println("Square: " + s.calculate(number));
    }
}