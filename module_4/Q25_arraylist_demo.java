import java.util.ArrayList;

public class Q25_arraylist_demo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Rohan");
        names.add("Karan");
        names.add("Priya");

        System.out.println("Elements in ArrayList:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}