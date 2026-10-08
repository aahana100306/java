public class Q41_hashmap_collision {
    public static void main(String[] args) {

        System.out.println("HashMap Collision Handling");
        System.out.println();

        System.out.println("1. A collision occurs when two keys produce");
        System.out.println("   the same hash bucket.");
        System.out.println("2. HashMap stores the entries in the same bucket.");
        System.out.println("3. It uses equals() to distinguish between keys.");
        System.out.println("4. In modern Java, buckets with many collisions");
        System.out.println("   can use a tree structure for better performance.");
        System.out.println();
        System.out.println("Therefore, HashMap can store different keys");
        System.out.println("even when their hash values collide.");
    }
}