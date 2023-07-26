package z020_compound_interest_program;

public class CompoundInterestProgram {
    public static void main(String[] args) {
        // Compound Interest Formula: Amount = Principal (1+Rate)^Time

        double amount;
        double principal = 10000;
        double rate = 0.01;

        for(int day = 1; day <= 20; day++) {
            amount = principal*Math.pow(1 + rate, day);
            System.out.println(day + "   " + amount);
        }
    }
}
