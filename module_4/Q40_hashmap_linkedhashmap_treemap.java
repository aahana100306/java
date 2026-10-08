public class Q40_hashmap_linkedhashmap_treemap {
    public static void main(String[] args) {

        System.out.println("HashMap vs LinkedHashMap vs TreeMap");
        System.out.println();

        System.out.println("HashMap:");
        System.out.println("1. Does not guarantee insertion order.");
        System.out.println("2. Stores key-value pairs.");
        System.out.println("3. Provides fast access to values.");
        System.out.println();

        System.out.println("LinkedHashMap:");
        System.out.println("1. Maintains insertion order.");
        System.out.println("2. Stores key-value pairs.");
        System.out.println("3. Useful when insertion order is required.");
        System.out.println();

        System.out.println("TreeMap:");
        System.out.println("1. Stores keys in sorted order.");
        System.out.println("2. Sorting is based on the keys.");
        System.out.println("3. Useful when sorted keys are required.");
    }
}