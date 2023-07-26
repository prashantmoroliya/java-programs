package z023_random_number_generator;

import java.util.Random;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random dice = new Random();

        int number;

        for(int counter = 1; counter <= 10; counter++) {
//            number = dice.nextInt(6);   // it will go from 0 to 5 which is less than 6..
            number = 1 + dice.nextInt(6);   // it will go from 1 to 6.. :)
            System.out.println(number + " ");
        }
    }
}
