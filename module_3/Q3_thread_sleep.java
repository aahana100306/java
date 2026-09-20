class FirstThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 1");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted.");
            }
        }
    }
}

class SecondThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 2");

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted.");
            }
        }
    }
}

public class Q3_thread_sleep {

    public static void main(String[] args) {

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();
    }
}