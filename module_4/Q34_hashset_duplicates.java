import java.util.HashSet;

public class Q34_hashset_duplicates {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Aman");
        names.add("Rohan");
        names.add("Aman");
        names.add("Karan");
        names.add("Rohan");

        System.out.println("HashSet:");
        System.out.println(names);

        System.out.println();
        System.out.println("Duplicate elements are not stored.");
    }
}