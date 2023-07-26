package z025_creating_an_array_table;

public class CreatingAnArrayTable {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int bucky[] = {32, 12, 18, 54, 2};

        for(int counter = 0; counter < bucky.length; counter++) {
            System.out.println(counter + "\t\t" + bucky[counter]);
        }
    }
}
