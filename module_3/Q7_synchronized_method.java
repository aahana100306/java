class TicketBooking {

    private int tickets = 5;

    synchronized void bookTicket(String user, int number) {

        if (tickets >= number) {

            System.out.println(user + " is trying to book " + number + " ticket(s).");

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Booking interrupted.");
            }

            tickets = tickets - number;

            System.out.println(user + " successfully booked " + number + " ticket(s).");
            System.out.println("Tickets remaining: " + tickets);
        }
        else {
            System.out.println(user + " could not book tickets.");
            System.out.println("Not enough tickets available.");
        }
    }
}

class User extends Thread {

    TicketBooking booking;
    int number;

    User(TicketBooking booking, String name, int number) {
        super(name);
        this.booking = booking;
        this.number = number;
    }

    public void run() {
        booking.bookTicket(getName(), number);
    }
}

public class Q7_synchronized_method {

    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        User u1 = new User(booking, "User-1", 2);
        User u2 = new User(booking, "User-2", 2);
        User u3 = new User(booking, "User-3", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}