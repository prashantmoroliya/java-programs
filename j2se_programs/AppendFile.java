import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        // file name with path
        String strFilePath = "CreateExample.txt";;

        try {
            //file output stream to open and write data
            FileOutputStream fos = new FileOutputStream(strFilePath, true);                                                                                                                                                                                                                                                                              

            //string to be appended
            String strContent = "\nText to be appended";

            //appending text/string
            fos.write(strContent.getBytes());
            //closing the file
            fos.close();
            System.out.println("Content Successfully Append into File...");
        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException : " + fnfe.toString());
        } catch (IOException ioe) {
            System.out.println("IOException : " + ioe.toString());
        } catch (Exception e) {
            System.out.println("Exception : " + e.toString());
        }
    }    
}
