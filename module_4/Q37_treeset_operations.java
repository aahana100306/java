import java.util.TreeSet;

public class Q37_treeset_operations {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);

        System.out.println("TreeSet after adding elements:");
        System.out.println(numbers);

        // Smallest element
        System.out.println();
        System.out.println("Smallest element: " + numbers.first());

        // Largest element
        System.out.println("Largest element: " + numbers.last());

        // Remove an element
        numbers.remove(40);

        System.out.println();
        System.out.println("After removing 40:");
        System.out.println(numbers);
    }
}
