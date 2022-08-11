import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("CreateExample.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the file.");
            System.out.println(array);

            // Coses the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
