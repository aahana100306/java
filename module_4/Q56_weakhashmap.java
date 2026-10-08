public class Q56_weakhashmap {
    public static void main(String[] args) {

        System.out.println("WeakHashMap vs HashMap");
        System.out.println();

        System.out.println("WeakHashMap:");
        System.out.println("1. Stores keys using weak references.");
        System.out.println("2. Entries can be removed by garbage collection");
        System.out.println("   when keys are no longer strongly referenced.");
        System.out.println("3. Useful for memory-sensitive applications.");
        System.out.println();

        System.out.println("HashMap:");
        System.out.println("1. Stores normal strong references to keys.");
        System.out.println("2. Entries remain until they are explicitly removed.");
        System.out.println("3. It is commonly used for key-value storage.");
    }
}