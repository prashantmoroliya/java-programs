package z018_simple_averaging_program;

import java.util.*;
public class SimpleAveragingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10) {
            grade = scanner.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("Your average is " + average);
    }
}
