import java.util.ArrayList;
import java.util.Collections;

public class Q30_sort_arraylist {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rohan");
        names.add("Aman");
        names.add("Karan");
        names.add("Priya");
        names.add("Neha");

        System.out.println("Original List:");
        System.out.println(names);

        Collections.sort(names);

        System.out.println();
        System.out.println("Alphabetical Order:");
        System.out.println(names);

        Collections.sort(names, Collections.reverseOrder());

        System.out.println();
        System.out.println("Reverse Alphabetical Order:");
        System.out.println(names);
    }
}