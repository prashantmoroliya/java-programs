package z071_writing_to_files;

public class WritingToFiles {
    public static void main(String[] args) {
        createfile g = new createfile();
        g.openFile();
        g.addRecords();
        g.closeFile();
    }
}
