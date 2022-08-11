import java.util.Scanner;

public class ConditionStatement {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        // simple if statement
        System.out.print("Enter any number : ");
        int num = scan.nextInt();
        
        if(num > 100)
            System.out.println(num+" is greater than 100");
        System.out.println("program ends...!");

        scan.close();
    }
}
