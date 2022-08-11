// WAP to enter ten elements find the max and min number.

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size;
        float max, min;

        System.out.print("Enter size of array : ");
        size = scan.nextInt();

        float num[] = new float[size];
        
        for(int i=0; i<size; i++) {
            System.out.print("Enter elements at num["+i+"] = ");
            num[i] = scan.nextFloat();
        }

        max = min = num[0];

        for(int i=0; i<size; i++) {
            if(num[i] > max) {
                max = num[i];
            } else if(num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Maximum num = "+max);
        System.out.println("Minimum num = "+min);

        scan.close();
    }    
}
