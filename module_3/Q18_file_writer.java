import java.io.FileWriter;
import java.io.IOException;

public class Q18_file_writer {

    public static void main(String[] args) {

        String text = "This file was created using FileWriter.";

        try {

            FileWriter file =
                    new FileWriter("example.txt");

            file.write(text);

            file.close();

            System.out.println("Data written successfully.");

        }
        catch (IOException e) {

            System.out.println("Error writing to the file.");
        }
    }
}