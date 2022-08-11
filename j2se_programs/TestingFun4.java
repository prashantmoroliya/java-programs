// testing first function type.... with returntype no parameter

import java.util.*;

public class TestingFun4 {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        TestingFun4 obj = new TestingFun4();

        int res = obj.send();
        System.out.println("send var is = "+(res+100));
    }

    public int send() {
        int x;
        System.out.print("enter value of x = ");
        x=scan.nextInt();
        return x;
    }
}
