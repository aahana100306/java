public class Q8_swap_elements {

    public static <T> void swapElements(T[] array, int first, int second) {

        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30};

        System.out.println("Before swapping:");
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        swapElements(numbers, 0, 2);

        System.out.println("After swapping:");
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        String[] names = {"Java", "Python", "C++"};

        System.out.println();
        System.out.println("Before swapping:");
        System.out.println(names[0] + " " + names[1] + " " + names[2]);

        swapElements(names, 0, 2);

        System.out.println("After swapping:");
        System.out.println(names[0] + " " + names[1] + " " + names[2]);
    }
}