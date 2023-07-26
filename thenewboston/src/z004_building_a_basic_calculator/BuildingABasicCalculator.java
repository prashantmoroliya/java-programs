package z004_building_a_basic_calculator;

import java.util.*;
public class BuildingABasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = scanner.nextDouble();
        System.out.println("Enter second num: ");
        snum = scanner.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}
