import java.util.ArrayList;
import java.util.Iterator;

public class Q21_list_iteration {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Using simple for loop:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println();
        System.out.println("Using enhanced for loop:");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Using while loop with Iterator:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}