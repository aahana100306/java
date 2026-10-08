import java.util.LinkedHashSet;

public class Q38_linkedhashset {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Aman");
        names.add("Rohan");
        names.add("Karan");
        names.add("Priya");

        System.out.println("LinkedHashSet elements:");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("LinkedHashSet maintains insertion order.");
    }
}