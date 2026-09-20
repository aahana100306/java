import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Q14_trylock_deadlock {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    static void task(String name, ReentrantLock first,
                     ReentrantLock second) {

        try {

            if (first.tryLock(1, TimeUnit.SECONDS)) {

                try {

                    System.out.println(name + " acquired first lock.");

                    Thread.sleep(300);

                    if (second.tryLock(1, TimeUnit.SECONDS)) {

                        try {
                            System.out.println(name
                                    + " acquired second lock.");
                        }
                        finally {
                            second.unlock();
                        }

                    }
                    else {
                        System.out.println(name
                                + " could not acquire second lock.");
                    }

                }
                finally {
                    first.unlock();
                }
            }

        }
        catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            task("Thread 1", lock1, lock2);
        });

        Thread t2 = new Thread(() -> {
            task("Thread 2", lock2, lock1);
        });

        t1.start();
        t2.start();
    }
}