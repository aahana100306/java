import java.util.ArrayList;
import java.util.Iterator;

public class Q14_iterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Rohan");
        names.add("Karan");

        Iterator<String> iterator = names.iterator();

        System.out.println("Elements using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Iterator is used to traverse collection elements.");
    }
}