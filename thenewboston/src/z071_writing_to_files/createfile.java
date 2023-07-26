package z071_writing_to_files;

import java.util.*;
import java.io.*;
import java.lang.*;

public class createfile {
    private Formatter x;

    public void openFile() {
        try {
            x = new Formatter("tamator.txt");
        } catch (Exception e) {
            System.out.println("you have an error");
        }
    }

    public void addRecords() {
        x .format("%s%s%s", "20 ", "bittu ", "ji");
    }

    public void closeFile() {
        x.close();
    }
}
