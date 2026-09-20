class ReverseText implements Runnable {

    public void run() {

        String text = "MULTITHREADING";

        for (int i = text.length() - 1; i >= 0; i--) {

            System.out.println(text.charAt(i));

            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Q2_runnable {

    public static void main(String[] args) {

        ReverseText obj = new ReverseText();

        Thread t = new Thread(obj);

        t.start();
    }
}