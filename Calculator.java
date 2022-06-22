/*
 *      @author: Prashant Kumar Moroliya
 * 
 *          Write a Java program to perform basic Calculator operations.
 */

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNumber, secondNumber;
        char choice;

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("----------------------CALCULATOR-----------------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("1. Addition           (+)");
            System.out.println("2. Subtraction        (-)");
            System.out.println("3. Multiplication     (*)");
            System.out.println("4. Division           (/)");
            System.out.println("5. Exit               (E)");
            System.out.println("-------------------------------------------------------");
            System.out.println("What operation do you want to perform?");
            choice = scan.next().charAt(0);
            choice = Character.toLowerCase(choice);
            
            switch(choice){
                case '+':{
                    System.out.print("Enter first number  = ");
                    firstNumber = scan.nextDouble();
                    System.out.print("Enter second number = ");
                    secondNumber = scan.nextDouble();
                    double addition = firstNumber+secondNumber;
                    System.out.println(firstNumber+"+"+secondNumber+" = "+addition);
                    break;
                }
                case '-':{
                    System.out.print("Enter first number  = ");
                    firstNumber = scan.nextDouble();
                    System.out.print("Enter second number = ");
                    secondNumber = scan.nextDouble();
                    double subtration = firstNumber-secondNumber;
                    System.out.println(firstNumber+"-"+secondNumber+" = "+subtration);
                    break;
                }
                case '*':{
                    System.out.print("Enter first number  = ");
                    firstNumber = scan.nextDouble();
                    System.out.print("Enter second number = ");
                    secondNumber = scan.nextDouble();
                    double multiplication = firstNumber*secondNumber;
                    System.out.println(firstNumber+"*"+secondNumber+" = "+multiplication);
                    break;
                }
                case '/':{
                    System.out.print("Enter first number  = ");
                    firstNumber = scan.nextDouble();
                    System.out.print("Enter second number = ");
                    secondNumber = scan.nextDouble();
                    double division = firstNumber/secondNumber;
                    System.out.println(firstNumber+"/"+secondNumber+" = "+division);
                    break;
                }
                case 'e':
                    System.exit(choice);
                default:
                    System.out.println("Enter correct operation (+, -, *, /) or press 'e' to exit.");
            }
        }while(choice != '+' || choice != '-' || choice != '*' || choice != '/' || choice != 'e');

        scan.close();
    }
}
