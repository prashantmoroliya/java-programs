// WAP to enter any number generate its multiplication table by using all three loops and also find its factorial value.

import java.util.*;

public class TableAndFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, fact=1;
        
        System.out.print("Enter a number of which you find Multiplication Table and Factorial : ");
        i = scan.nextInt();

        // using for loop...
        // calculate factorial...
        for(int f=1; f<=i; f++){
            fact *= f;      // fact = fact*f;
        }
        System.out.println("Factorial of "+i+" ("+i+"!"+") is = "+fact);

        // // calculate multiplication table...
        // for(int j=1; j<=10; j++){
        //     System.out.println(i+" x "+j+" = "+i*j);
        // }
        
        // //whileloop..
        // int j=1;
        // while(j<=10){
        //     System.out.println(i+" x "+j+" = "+i*j);
        //     j++;
        // }

        // do..while loop
        int j=1;
        do{
            System.out.println(i+" x "+j+" = "+i*j);
            j++;
        } while(j!=11);

        scan.close();
    }
}
