import java.io.IOException;
import java.io.RandomAccessFile;

public class Q24_random_access_file {
    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("random.txt", "rw");

            file.writeUTF("Hello Java Programming");

            file.seek(0);

            String data = file.readUTF();

            System.out.println("Data in file: " + data);

            file.seek(6);

            System.out.println("File pointer position: " + file.getFilePointer());

            file.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}