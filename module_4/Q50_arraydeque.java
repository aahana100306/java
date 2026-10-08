import java.util.ArrayDeque;

public class Q50_arraydeque {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add at both ends
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addLast("D");

        System.out.println("Deque after adding:");
        System.out.println(deque);

        // Peek at both ends
        System.out.println();
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Remove from both ends
        System.out.println();
        System.out.println("Removed from first: " + deque.removeFirst());
        System.out.println("Removed from last: " + deque.removeLast());

        System.out.println();
        System.out.println("Deque after removing:");
        System.out.println(deque);
    }
}