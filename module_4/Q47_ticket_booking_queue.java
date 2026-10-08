import java.util.LinkedList;
import java.util.Queue;

public class Q47_ticket_booking_queue {
    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.add("Aman");
        customers.add("Rohan");
        customers.add("Karan");
        customers.add("Priya");

        System.out.println("Customers waiting for tickets:");
        System.out.println(customers);

        System.out.println();
        System.out.println("Ticket booked for: " + customers.remove());
        System.out.println("Ticket booked for: " + customers.remove());

        System.out.println();
        System.out.println("Remaining customers:");
        System.out.println(customers);
    }
}