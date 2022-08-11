// testing first function type.... no returntype with parameter

import java.util.*;

public class TestingFun2 {
    public void add(int x, int y){
        int ans;
        ans = x+y;
        System.out.println(x+"+"+y+"="+ans);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("enter value of a = ");
        a = scan.nextInt();
        System.out.println("enter value of b =");
        b = scan.nextInt();

        TestingFun2 tf2 = new TestingFun2();
        tf2.add(a, b);
        tf2.sayHello();
        tf2.squareRoot(a);

        scan.close();
    }
    public void sayHello(){
        System.out.println("Hello there!");
    }
    public void squareRoot(int x) {
        System.out.println("Square of "+x+" = "+Math.sqrt(x));
    }
}
