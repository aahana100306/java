import java.util.concurrent.locks.ReentrantLock;

class SafeCounter {

    private int count = 0;

    private ReentrantLock lock = new ReentrantLock();

    void increment() {

        lock.lock();

        try {
            count++;
        }
        finally {
            lock.unlock();
        }
    }

    int getCount() {
        return count;
    }
}

class UnsafeCounter {

    private int count = 0;

    void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class SafeWorker extends Thread {

    SafeCounter counter;

    SafeWorker(SafeCounter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}

class UnsafeWorker extends Thread {

    UnsafeCounter counter;

    UnsafeWorker(UnsafeCounter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}

public class Q13_reentrant_lock {

    public static void main(String[] args) throws InterruptedException {

        SafeCounter safeCounter = new SafeCounter();

        SafeWorker s1 = new SafeWorker(safeCounter);
        SafeWorker s2 = new SafeWorker(safeCounter);

        s1.start();
        s2.start();

        s1.join();
        s2.join();

        System.out.println("Counter using ReentrantLock: "
                + safeCounter.getCount());

        UnsafeCounter unsafeCounter = new UnsafeCounter();

        UnsafeWorker u1 = new UnsafeWorker(unsafeCounter);
        UnsafeWorker u2 = new UnsafeWorker(unsafeCounter);

        u1.start();
        u2.start();

        u1.join();
        u2.join();

        System.out.println("Counter without lock: "
                + unsafeCounter.getCount());
    }
}