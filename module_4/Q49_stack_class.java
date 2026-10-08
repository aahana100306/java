import java.util.Stack;

public class Q49_stack_class {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // Push
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack:");
        System.out.println(stack);

        // Peek
        System.out.println();
        System.out.println("Top element: " + stack.peek());

        // Pop
        System.out.println("Popped element: " + stack.pop());

        System.out.println();
        System.out.println("Stack after pop:");
        System.out.println(stack);

        // Check empty
        System.out.println();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}