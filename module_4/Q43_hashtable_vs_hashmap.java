public class Q43_hashtable_vs_hashmap {
    public static void main(String[] args) {

        System.out.println("Hashtable vs HashMap");
        System.out.println();

        System.out.println("Hashtable:");
        System.out.println("1. Hashtable is synchronized.");
        System.out.println("2. It does not allow null keys or null values.");
        System.out.println("3. It is a legacy class.");
        System.out.println();

        System.out.println("HashMap:");
        System.out.println("1. HashMap is not synchronized by default.");
        System.out.println("2. It allows one null key and multiple null values.");
        System.out.println("3. It is generally preferred for modern programs.");
        System.out.println();

        System.out.println("Hashtable is considered legacy because");
        System.out.println("newer collection classes provide more flexibility.");
    }
}