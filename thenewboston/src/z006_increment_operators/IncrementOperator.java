package z006_increment_operators;

import java.util.*;
public class IncrementOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;

//        ++tuna;       // pre increment
//        System.out.println(tuna);
//        System.out.println(++tuna);
//        System.out.println(tuna++); // tuna++ is post increment
//        System.out.println(tuna);

//        System.out.println(--tuna); // pre decrement
//        System.out.println(tuna--); // post decrement
//        System.out.println(tuna);

//        tuna = tuna + 5;
//        tuna += 8;  // assignment operator I guess here addition
//        tuna -= 8;  // here subtraction
        tuna *= 8;  // here it is multiplication

        System.out.println(tuna);
    }
}
