import java.util.ArrayList;

public class Q28_list_operations {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Aman");
        names.add("Rohan");
        names.add("Karan");
        names.add("Priya");

        System.out.println("After adding elements:");
        System.out.println(names);

        // Remove by value
        names.remove("Rohan");

        System.out.println("After removing Rohan:");
        System.out.println(names);

        // Remove by index
        names.remove(1);

        System.out.println("After removing element at index 1:");
        System.out.println(names);

        // Replace an element
        names.set(0, "Arjun");

        System.out.println("After replacing index 0:");
        System.out.println(names);
    }
}