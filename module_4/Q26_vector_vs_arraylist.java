public class Q26_vector_vs_arraylist {
    public static void main(String[] args) {

        System.out.println("Vector vs ArrayList");
        System.out.println();

        System.out.println("Vector:");
        System.out.println("1. Vector is a dynamic array.");
        System.out.println("2. Vector is synchronized.");
        System.out.println("3. It is thread-safe.");
        System.out.println("4. It may be slower because of synchronization.");
        System.out.println();

        System.out.println("ArrayList:");
        System.out.println("1. ArrayList is a dynamic array.");
        System.out.println("2. ArrayList is not synchronized by default.");
        System.out.println("3. It is generally faster than Vector.");
        System.out.println("4. It is preferred when thread safety is not required.");
    }
}