package z028_enhanced_for_loop;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int bucky[] = {3, 4, 5, 6, 7};  // we create array
        int total = 0;      // variable to hold the sum of values of array

        // Enhanced for statement
        // for ( variable to hold : identifier)
        for(int x: bucky) {
            total += x;
        }

        System.out.println(total);
    }
}
