class Chopstick {

    String name;

    Chopstick(String name) {
        this.name = name;
    }
}

class Philosopher extends Thread {

    Chopstick first;
    Chopstick second;

    Philosopher(String name, Chopstick first, Chopstick second) {
        super(name);
        this.first = first;
        this.second = second;
    }

    public void run() {

        synchronized (first) {

            System.out.println(getName() + " picked up " + first.name);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }

            System.out.println(getName() + " is waiting for " + second.name);

            synchronized (second) {
                System.out.println(getName() + " picked up " + second.name);
            }
        }
    }
}

public class Q9_deadlock {

    public static void main(String[] args) {

        Chopstick chopstick1 = new Chopstick("Chopstick-1");
        Chopstick chopstick2 = new Chopstick("Chopstick-2");

        Philosopher p1 = new Philosopher(
            "Philosopher-1",
            chopstick1,
            chopstick2
        );

        Philosopher p2 = new Philosopher(
            "Philosopher-2",
            chopstick2,
            chopstick1
        );

        p1.start();
        p2.start();
    }
}