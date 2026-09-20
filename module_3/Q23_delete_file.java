import java.io.File;

public class Q23_delete_file {
    public static void main(String[] args) {

        File file = new File("copy.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File could not be deleted.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}