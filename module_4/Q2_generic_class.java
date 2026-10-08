public class Q2_generic_class {

    static class Box<T> {
        T value;

        Box(T value) {
            this.value = value;
        }

        void display() {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {

        Box<String> b1 = new Box<>("Hello");
        Box<Integer> b2 = new Box<>(100);

        b1.display();
        b2.display();
    }
}