import java.util.ArrayList;
import java.util.List;

public class Q4_extends_super {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        List<? extends Number> readList = numbers;

        System.out.println("Using ? extends Number:");
        System.out.println("First value: " + readList.get(0));

        List<Number> numberList = new ArrayList<>();

        List<? super Integer> writeList = numberList;

        writeList.add(100);
        writeList.add(200);

        System.out.println();
        System.out.println("Using ? super Integer:");
        System.out.println("Values: " + numberList);
    }
}