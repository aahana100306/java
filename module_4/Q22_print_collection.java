import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Q22_print_collection {

    public static <T> void printCollection(Collection<T> collection) {

        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("List:");
        printCollection(list);

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println();
        System.out.println("Set:");
        printCollection(set);

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        System.out.println();
        System.out.println("Queue:");
        printCollection(queue);
    }
}