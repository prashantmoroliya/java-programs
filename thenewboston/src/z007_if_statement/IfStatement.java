package z007_if_statement;

public class IfStatement {
    public static void main(String[] args) {
        int test = 6;

        // one equal (=) mean assigning value
        // two equal (==) means equal sign...

        // total 6 types: ==, !=, >, <, <=, >=

//        if(test == 9) {
        if(test < 9) {
            System.out.println("yes");
        } else {
            System.out.println("this is else");
        }
    }
}
