import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q22_copy_file {
    public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destinationFile = "copy.txt";

        try {
            FileInputStream input = new FileInputStream(sourceFile);
            FileOutputStream output = new FileOutputStream(destinationFile);

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
        }
    }
}