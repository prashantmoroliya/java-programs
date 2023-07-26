package z072_reading_from_files;

public class ReadingFromFiles {
    public static void main(String[] args) {
        readfile r = new readfile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
