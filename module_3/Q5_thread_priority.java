class Worker extends Thread {

    public Worker(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                getName() + " is running. Priority: " + getPriority()
            );
        }
    }
}

public class Q5_thread_priority {

    public static void main(String[] args) {

        Worker w1 = new Worker("Worker-1");
        Worker w2 = new Worker("Worker-2");
        Worker w3 = new Worker("Worker-3");

        w1.setPriority(Thread.MIN_PRIORITY);
        w2.setPriority(Thread.NORM_PRIORITY);
        w3.setPriority(Thread.MAX_PRIORITY);

        w1.start();
        w2.start();
        w3.start();
    }
}