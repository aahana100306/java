import java.util.Arrays;
import java.util.List;

public class Q10_min_max_finder {

    static class MinMaxFinder<T extends Comparable<T>> {

        T findMin(List<T> list) {

            T min = list.get(0);

            for (T item : list) {
                if (item.compareTo(min) < 0) {
                    min = item;
                }
            }

            return min;
        }

        T findMax(List<T> list) {

            T max = list.get(0);

            for (T item : list) {
                if (item.compareTo(max) > 0) {
                    max = item;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

        MinMaxFinder<Integer> integerFinder = new MinMaxFinder<>();

        List<Integer> numbers = Arrays.asList(40, 10, 70, 20, 50);

        System.out.println("Integer List: " + numbers);
        System.out.println("Minimum: " + integerFinder.findMin(numbers));
        System.out.println("Maximum: " + integerFinder.findMax(numbers));

        System.out.println();

        MinMaxFinder<String> stringFinder = new MinMaxFinder<>();

        List<String> names = Arrays.asList("Zara", "Amit", "Rohan", "Karan");

        System.out.println("String List: " + names);
        System.out.println("Minimum: " + stringFinder.findMin(names));
        System.out.println("Maximum: " + stringFinder.findMax(names));
    }
}