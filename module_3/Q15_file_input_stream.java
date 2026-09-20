import java.io.FileInputStream;
import java.io.IOException;

public class Q15_file_input_stream {

    public static void main(String[] args) {

        try {

            FileInputStream file =
                    new FileInputStream("input.txt");

            int data;

            while ((data = file.read()) != -1) {

                System.out.print((char) data);
            }

            file.close();
        }
        catch (IOException e) {

            System.out.println("Error reading the file.");
        }
    }
}