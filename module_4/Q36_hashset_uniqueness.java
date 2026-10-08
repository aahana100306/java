import java.util.HashSet;

public class Q36_hashset_uniqueness {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Adding 10: " + numbers.add(10));
        System.out.println("Adding 20: " + numbers.add(20));
        System.out.println("Adding 10 again: " + numbers.add(10));
        System.out.println("Adding 30: " + numbers.add(30));
        System.out.println("Adding 20 again: " + numbers.add(20));

        System.out.println();
        System.out.println("Final HashSet:");
        System.out.println(numbers);
    }
}