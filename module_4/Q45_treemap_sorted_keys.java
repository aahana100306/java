import java.util.TreeMap;

public class Q45_treemap_sorted_keys {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(50, "Aman");
        students.put(20, "Rohan");
        students.put(40, "Karan");
        students.put(10, "Priya");
        students.put(30, "Neha");

        System.out.println("Unsorted keys were added.");
        System.out.println("TreeMap stores them as:");
        System.out.println(students);

        System.out.println();
        System.out.println("Keys in sorted order:");

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }
    }
}