public class ThrowExample {
    public static void checkEligibility(int stuage, int stuweight) {
        if(stuage<12 && stuweight<40){
            throw new ArithmeticException("Not Eligible");
        } else {
            System.out.println("Student is valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Reg. process");
        checkEligibility(22, 45);
        System.out.println("Have a nice day.");
    }
}
