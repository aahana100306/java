import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q27_email_validation {
    public static void main(String[] args) {

        String email = "student@example.com";

        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        if (m.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
}