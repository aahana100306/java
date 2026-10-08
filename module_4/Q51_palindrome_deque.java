import java.util.ArrayDeque;
import java.util.Deque;

public class Q51_palindrome_deque {
    public static void main(String[] args) {

        String word = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        boolean palindrome = true;

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}