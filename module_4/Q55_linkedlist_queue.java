import java.util.LinkedList;

public class Q55_linkedlist_queue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Aman");
        queue.add("Rohan");
        queue.add("Karan");

        System.out.println("Queue:");
        System.out.println(queue);

        // Remove first element
        System.out.println();
        System.out.println("Removed: " + queue.remove());

        // Peek first element
        System.out.println("Front element: " + queue.peek());

        System.out.println();
        System.out.println("Queue after operations:");
        System.out.println(queue);
    }
}
