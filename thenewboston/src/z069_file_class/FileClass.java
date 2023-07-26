package z069_file_class;

import java.io.File;
public class FileClass {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\prash\\Desktop\\java-programs\\thenewboston\\src\\z069_file_class\\thenewboston.txt");

        if (x.exists()) {
            System.out.println(x.getName() + " exist!");
        } else {
            System.out.println("This thing doesn't exist");
        }
    }
}
