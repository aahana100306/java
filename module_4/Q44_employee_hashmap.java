import java.util.HashMap;
import java.util.Map;

public class Q44_employee_hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        // Add key-value pairs
        employees.put(101, "Aman");
        employees.put(102, "Rohan");
        employees.put(103, "Karan");
        employees.put(104, "Priya");

        System.out.println("Employee Map:");
        System.out.println(employees);

        // Check if key exists
        System.out.println();
        if (employees.containsKey(102)) {
            System.out.println("Employee ID 102 exists.");
        } else {
            System.out.println("Employee ID 102 does not exist.");
        }

        // KeySet
        System.out.println();
        System.out.println("Using KeySet:");

        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id);
        }

        // EntrySet
        System.out.println();
        System.out.println("Using EntrySet:");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }
    }
}