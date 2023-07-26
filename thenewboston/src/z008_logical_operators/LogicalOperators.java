package z008_logical_operators;

import java.util.*;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boy, girl;
//        boy = 18;
        boy = 8;
//        girl = 68;
//        girl = 40;
        girl = 99;

//        if(boy > 10) {
//        if(boy > 10 && girl < 60) {     // && means Logical AND
        if(boy > 10 || girl < 60) {     // || means Logical OR
            System.out.println("You can enter");
        } else {
            System.out.println("You can not enter");
        }
    }
}
