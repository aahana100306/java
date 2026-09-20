import java.io.File;

public class Q21_list_directory {
    public static void main(String[] args) {

        File directory = new File(".");

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            System.out.println("Files and directories:");

            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("The given path is not a directory.");
        }
    }
}