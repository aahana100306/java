import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Q9_exception_logging {

    static Logger logger = Logger.getLogger(Q9_exception_logging.class.getName());

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18.");
        }

        System.out.println("Age is valid.");
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        FileHandler file = new FileHandler("error.log", true);
        file.setFormatter(new SimpleFormatter());

        logger.addHandler(file);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());

            logger.severe("Invalid age entered: " + age);
        }

        file.close();
        sc.close();
    }
}