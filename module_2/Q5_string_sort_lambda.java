import java.util.ArrayList;
import java.util.Collections;
public class Q5_string_sort_lambda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Riya");
        names.add("Aarav");
        names.add("Kabir");
        names.add("Meera");
        System.out.println("Original list:");
        System.out.println(names);
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("Descending order:");
        System.out.println(names);
    }
}