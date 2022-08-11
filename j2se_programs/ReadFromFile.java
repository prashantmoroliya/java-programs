import java.io.*;
import java.util.Scanner;

class ReadFromFile {
    public static void main(String args[]) {
        try {
            //File f1 = new File("CreateExample.txt");
            File f1 = new File("CopyFile.txt");
            Scanner dataReader = new Scanner(f1);
            while(dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("Unexpected error occureed!");
            e.printStackTrace();
        }
    }
}
