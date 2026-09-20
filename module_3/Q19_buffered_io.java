import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q19_buffered_io {

    public static void main(String[] args) {

        String text = "Java Buffered I/O Example";

        // Writing using BufferedWriter
        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("buffered.txt"));

            writer.write(text);

            writer.close();

            System.out.println("Data written using BufferedWriter.");

        }
        catch (IOException e) {

            System.out.println("Error writing to the file.");
        }

        // Reading using BufferedReader
        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader("buffered.txt"));

            String line;

            System.out.println("File contents:");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        }
        catch (IOException e) {

            System.out.println("Error reading the file.");
        }
    }
}