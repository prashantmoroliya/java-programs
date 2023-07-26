package z073_exception_handling;

import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 1;

//        // this will fail if we divide by zero(0)...
//        System.out.println("Enter first num: ");
//        int n1 = input.nextInt();
//        System.out.println("Enter second num: ");
//        int n2 = input.nextInt();
//
//        int sum = n1/n2;
//
//        System.out.println("Sum = " + sum);

        do {
            try {
                System.out.println("Enter first num: ");
                int n1 = input.nextInt();
                System.out.println("Enter second num: ");
                int n2 = input.nextInt();

                int sum = n1 / n2;

                System.out.println("Sum = " + sum);
                x = 2;
            } catch (Exception e) {
                System.out.println("You can't do that");
            }
        } while (x==1);
    }
}
