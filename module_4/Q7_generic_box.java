public class Q7_generic_box {

    static class Box<T> {

        private T item;

        void addItem(T item) {
            this.item = item;
        }

        T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello Java");

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(100);

        System.out.println("String Box: " + stringBox.getItem());
        System.out.println("Integer Box: " + integerBox.getItem());
    }
}