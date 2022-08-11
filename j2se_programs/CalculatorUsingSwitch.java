/* WAP to enter two nos calculate their sum, sub, mul and div by using switch case.

    -------------------Menu-------------------
    <1> Add
    <2> Sub
    <3> Mul
    <4> Div
    ------------------------------------------
    Enter your choice = 
    ------------------------------------------
    Enter value for v1 =
    Enter value for v2 = 
    
    {choice} of v1 & v2 is =
    
    {choice} is in char
 */

import java.util.*;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double var1, var2;
        char ch;

        System.out.println("-------------------Menu-------------------");
        System.out.println("<1> Add");
        System.out.println("<2> Sub");
        System.out.println("<3> Mul");
        System.out.println("<4> Div");
        System.out.println("------------------------------------------");
        System.out.print("Enter your choice (A - Addition, S - Subtraction, M - Multiplication, D - Division) = ");
        ch = scan.next().charAt(0);
        ch = Character.toLowerCase(ch);
        
        switch(ch){
            case 'a': {
                System.out.print("Enter value of var 1 = ");
                var1 = scan.nextInt();        
                System.out.print("Enter value of var 2 = ");
                var2 = scan.nextInt();
                double addition = var1+var2;
                System.out.println("Addition of "+var1+" and "+var2+" is = "+addition);
                break;
            }
            case 's': {
                System.out.print("Enter value of var 1 = ");
                var1 = scan.nextInt();        
                System.out.print("Enter value of var 2 = ");
                var2 = scan.nextInt();
                double subtraction = var1-var2;
                System.out.println("Subtraction of "+var1+" and "+var2+" is = "+subtraction);
                break;
            }
            case 'm': {
                System.out.print("Enter value of var 1 = ");
                var1 = scan.nextInt();        
                System.out.print("Enter value of var 2 = ");
                var2 = scan.nextInt();
                double multiplication = var1*var2;
                System.out.println("Multiplication of "+var1+" and "+var2+" is = "+multiplication);
                break;
            }
            case 'd': {
                System.out.print("Enter value of var 1 = ");
                var1 = scan.nextInt();        
                System.out.print("Enter value of var 2 = ");
                var2 = scan.nextInt();
                double division = var1/var2;
                System.out.println("Division of "+var1+" and "+var2+" is = "+division);
                break;
            }
            default:
                System.out.println("Enter correct choice (A, S, M, D) : ");
        }
        scan.close();
    }
}
