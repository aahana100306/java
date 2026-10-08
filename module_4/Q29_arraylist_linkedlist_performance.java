import java.util.ArrayList;
import java.util.LinkedList;

public class Q29_arraylist_linkedlist_performance {
    public static void main(String[] args) {

        int size = 10000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Adding at beginning
        long start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }

        long arrayAddTime = System.nanoTime() - start;

        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            linkedList.addFirst(i);
        }

        long linkedAddTime = System.nanoTime() - start;

        // Removing from middle
        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }

        long arrayRemoveTime = System.nanoTime() - start;

        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }

        long linkedRemoveTime = System.nanoTime() - start;

        // Iteration
        start = System.nanoTime();

        for (int value : arrayList) {
            int x = value;
        }

        long arrayIterationTime = System.nanoTime() - start;

        start = System.nanoTime();

        for (int value : linkedList) {
            int x = value;
        }

        long linkedIterationTime = System.nanoTime() - start;

        System.out.println("Performance Comparison");
        System.out.println();

        System.out.println("Adding at beginning:");
        System.out.println("ArrayList: " + arrayAddTime + " ns");
        System.out.println("LinkedList: " + linkedAddTime + " ns");

        System.out.println();

        System.out.println("Removing from middle:");
        System.out.println("ArrayList: " + arrayRemoveTime + " ns");
        System.out.println("LinkedList: " + linkedRemoveTime + " ns");

        System.out.println();

        System.out.println("Iteration:");
        System.out.println("ArrayList: " + arrayIterationTime + " ns");
        System.out.println("LinkedList: " + linkedIterationTime + " ns");
    }
}
