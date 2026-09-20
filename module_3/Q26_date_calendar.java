import java.util.Calendar;
import java.util.Date;

public class Q26_date_calendar {
    public static void main(String[] args) {

        Date currentDate = new Date();

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Date: " + currentDate);

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
    }
}