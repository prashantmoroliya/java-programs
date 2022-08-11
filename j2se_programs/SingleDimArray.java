import java.util.*;

public class SingleDimArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size;
        System.out.print("Enter size of array : ");
        size = scan.nextInt();

        int num[] = new int[size];      // Declaration of array...

        // Creating Array...
        for(int i=0; i<size; i++) {
            System.out.print("Enter elements at num["+i+"] = ");
            num[i] = scan.nextInt();
        }
        
        // Display Array...
        for(int i=0; i<num.length; i++) {
            System.out.println("num["+i+"] = "+num[i]);
        }

        scan.close();
    }
}
