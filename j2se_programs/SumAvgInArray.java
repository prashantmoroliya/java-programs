// WAP to enter ten elements of an array, calculate their sum and average.

import java.util.*;

public class SumAvgInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size;
        float sum=0;
        System.out.print("Enter size of array : ");
        size = scan.nextInt();

        float num[] = new float[size];
        
        for(int i=0; i<size; i++) {
            System.out.print("Enter elements at num["+i+"] = ");
            num[i] = scan.nextFloat();
        }

        for(int i=0; i<size; i++) {
            sum += num[i];
        }
        System.out.println("sum of "+size+" elements of array = "+sum);

        float average = sum/size;
        System.out.println("average of "+size+" elements of array = "+average);

        scan.close();
    }    
}
