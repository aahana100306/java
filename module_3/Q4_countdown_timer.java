class Countdown extends Thread {

    public void run() {

        for (int i = 10; i >= 1; i--) {

            System.out.println("Countdown: " + i);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Countdown interrupted.");
            }
        }
    }
}

class TickThread extends Thread {

    public void run() {

        for (int i = 1; i <= 20; i++) {

            System.out.println("Tick...");

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Tick thread interrupted.");
            }
        }
    }
}

public class Q4_countdown_timer {

    public static void main(String[] args) {

        Countdown countdown = new Countdown();
        TickThread tick = new TickThread();

        countdown.start();
        tick.start();
    }
}