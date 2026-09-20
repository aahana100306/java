class AutoSave extends Thread {

    public void run() {

        while (true) {

            System.out.println("Auto-Save in progress...");

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                System.out.println("Auto-save interrupted.");
                break;
            }
        }
    }
}

public class Q6_daemon_thread {

    public static void main(String[] args) {

        AutoSave autoSave = new AutoSave();

        autoSave.setDaemon(true);

        autoSave.start();

        System.out.println("File processing started.");

        for (int i = 1; i <= 10; i++) {

            System.out.println("Processing file part " + i);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("File processing completed.");
    }
}