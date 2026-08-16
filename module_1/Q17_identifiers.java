public class Q17_identifiers {

    public static void main(String[] args) {
        int age = 20;
        int studentMarks = 95;
        int _count = 10;
        int $price = 500;
        int number1 = 25;

        System.out.println("Valid Identifiers:");
        System.out.println("age = " + age);
        System.out.println("studentMarks = " + studentMarks);
        System.out.println("_count = " + _count);
        System.out.println("$price = " + $price);
        System.out.println("number1 = " + number1);

        System.out.println("\nInvalid Identifiers (shown as comments):");
        System.out.println("2number -> Invalid (starts with a digit)");
        System.out.println("student-name -> Invalid (contains '-')");
        System.out.println("class -> Invalid (Java keyword)");
        System.out.println("first name -> Invalid (contains space)");
        System.out.println("@value -> Invalid (contains special character)");
    }
}