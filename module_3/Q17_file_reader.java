import java.io.FileReader;
import java.io.IOException;

public class Q17_file_reader {

    public static void main(String[] args) {

        try {

            FileReader file =
                    new FileReader("output.txt");

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