import java.io.FileOutputStream;
import java.io.IOException;

public class Q16_file_output_stream {

    public static void main(String[] args) {

        String text = "Java I/O Streams Example";

        try {

            FileOutputStream file =
                    new FileOutputStream("output.txt");

            file.write(text.getBytes());

            file.close();

            System.out.println("Data written successfully.");

        }
        catch (IOException e) {

            System.out.println("Error writing to the file.");
        }
    }
}