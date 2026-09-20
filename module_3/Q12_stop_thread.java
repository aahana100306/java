class FileDownload extends Thread {

    private boolean downloading = true;

    public void stopDownload() {
        downloading = false;
    }

    public void run() {

        int chunk = 1;

        while (downloading && chunk <= 20) {

            System.out.println("Downloading chunk " + chunk);

            chunk++;

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Download interrupted.");
                break;
            }
        }

        System.out.println("Download stopped gracefully.");
    }
}

public class Q12_stop_thread {

    public static void main(String[] args) {

        FileDownload download = new FileDownload();

        download.start();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Stopping download...");

        download.stopDownload();
    }
}