public class Q49_string_immutability {

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println("Original string: " + str);

        str.concat(" World");

        System.out.println("After concat(): " + str);

        str = str.concat(" World");

        System.out.println("After assigning new string: " + str);
    }
}