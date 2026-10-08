import java.util.TreeMap;

public class Q42_treemap_sorting {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Rohan");
        students.put(101, "Aman");
        students.put(105, "Karan");
        students.put(102, "Priya");

        System.out.println("TreeMap:");
        System.out.println(students);
    }
}