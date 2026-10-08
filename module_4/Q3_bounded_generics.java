public class Q3_bounded_generics {

    static class NumberBox<T extends Number> {

        T value;

        NumberBox(T value) {
            this.value = value;
        }

        void display() {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {

        NumberBox<Integer> n1 = new NumberBox<>(100);
        NumberBox<Double> n2 = new NumberBox<>(25.5);

        n1.display();
        n2.display();
    }
}