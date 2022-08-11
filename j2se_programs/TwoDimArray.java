import java.util.*;

public class TwoDimArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row, coloums;
        int numberOfRows, numberOfColoums;

        System.out.print("Enter number of rows of array : ");
        numberOfRows = scan.nextInt();
        System.out.print("Enter number of coloums of array : ");
        numberOfColoums = scan.nextInt();
        int num[][] = new int[numberOfRows][numberOfColoums];

        for(row=0; row<num.length; row++) {
            for(coloums=0; coloums<num.length; coloums++) {
                System.out.print("enter element at["+row+"]["+coloums+"] = ");
                num[row][coloums] = scan.nextInt();
            }
        }

        System.out.println("Array is ");
        for(row=0; row<num.length; row++) {
            for(coloums=0; coloums<num.length; coloums++) {
                System.out.print(num[row][coloums]+" ");
            }
            System.out.println();
        }

        scan.close();
    }
}
