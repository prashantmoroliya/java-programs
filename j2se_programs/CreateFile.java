import java.io.*;

class CreateFile {
    public static void main(String args[]) {
        try {
            File f0 = new File("CreateExample.txt");
            if(f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch(IOException e) {
            System.out.println("An unexpected error is occurred.");
            e.printStackTrace();
        }
    }
}
