import java.util.ArrayList;

public class Q9_generic_stack {

    static class Stack<T> {

        ArrayList<T> items = new ArrayList<>();

        void push(T item) {
            items.add(item);
        }

        T pop() {
            if (items.isEmpty()) {
                return null;
            }

            return items.remove(items.size() - 1);
        }

        T peek() {
            if (items.isEmpty()) {
                return null;
            }

            return items.get(items.size() - 1);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Integer Stack:");
        System.out.println("Top: " + numbers.peek());
        System.out.println("Popped: " + numbers.pop());
        System.out.println("Top after pop: " + numbers.peek());

        Stack<String> names = new Stack<>();

        names.push("Java");
        names.push("Python");
        names.push("C++");

        System.out.println();
        System.out.println("String Stack:");
        System.out.println("Top: " + names.peek());
        System.out.println("Popped: " + names.pop());
        System.out.println("Top after pop: " + names.peek());
    }
}