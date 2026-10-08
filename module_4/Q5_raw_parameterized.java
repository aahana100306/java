import java.util.ArrayList;
import java.util.List;

public class Q5_raw_parameterized {

    public static void main(String[] args) {

        // Raw type
        List rawList = new ArrayList();
        rawList.add("Java");
        rawList.add(100);

        System.out.println("Raw type:");
        System.out.println(rawList);

        // Parameterized type
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Generics");

        System.out.println();
        System.out.println("Parameterized type:");
        System.out.println(stringList);

        System.out.println();
        System.out.println("Raw types should be avoided because they:");
        System.out.println("1. Reduce type safety.");
        System.out.println("2. May cause ClassCastException.");
        System.out.println("3. Generate compiler warnings.");
        System.out.println("4. Do not clearly specify the type of data.");
    }
}