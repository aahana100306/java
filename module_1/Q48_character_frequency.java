import java.util.Scanner;

public class Q48_character_frequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean[] counted = new boolean[str.length()];

        System.out.println("Character frequencies:");

        for (int i = 0; i < str.length(); i++) {

            if (counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }

        sc.close();
    }
}