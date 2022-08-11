import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            //input file
            FileOutputStream sourceFile = new FileOutputStream("CreateExample.txt");

            //output file
            FileOutputStream targetFile = new FileOutputStream("CopyFile.txt");

            //Copy each byte from the input to output
            int byteValue;

            //read byte from first file and write it into second line
            while((byteValue = sourceFile.read()) != -1) {
                targetFile.write(byteValue);
            }

            // close the files!!!
            sourceFile.close();
            targetFile.close();

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Exception : " + e.toString());
        }
    }
}
