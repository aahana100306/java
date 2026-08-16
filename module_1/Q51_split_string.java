import java.util.Scanner;

public class Q51_split_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words:");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}