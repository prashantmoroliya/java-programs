// testing first function type.... with returntype with parameter

import java.util.*;

public class TestingFun3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter number 1 to add and sub = ");
        num1 = scan.nextInt();
        System.out.println("Enter number 2 to add and sub = ");
        num2 = scan.nextInt();

        TestingFun3 obj = new TestingFun3();
        System.out.println("Addition of x and y is = "+obj.add(num1, num2));
        float res = obj.sub(num1, num2);
        System.out.println("Subtraction of a and b is = "+res);
        System.out.println(greet(""));

        scan.close();
    }

    public int add(int x, int y) {
        int z;
        z=x+y;
        return z;
    }

    public float sub(int a, float b) {
        return a-b;
    }

    public static String greet(String msg) {
        return msg = "Hello there!";
    }
}
