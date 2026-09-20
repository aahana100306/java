class EvenThread extends Thread {

    public void run() {

        for (int i = 2; i <= 20; i += 2) {

            System.out.println(i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Q1_thread_class {

    public static void main(String[] args) {

        EvenThread t = new EvenThread();

        t.start();
    }
}
