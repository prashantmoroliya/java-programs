package z005_math_operators;

import java.util.*;
public class MathOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int girls, boys, people;
//        double girls, boys, people;

//        girls = 6;
//        girls = 11;
        girls = 7;
        boys = 3;

//        people = girls + boys;  // addition math operator
//        people = girls - boys;  // subtraction math operator
//        people = girls * boys;  // multiplication math operator
//        people = girls / boys;  // division math operator
        people = girls % boys;  // modulo math operator

        System.out.println(people);
    }
}
