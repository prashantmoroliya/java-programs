import java.util.*;

public class TestingSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your choice (1-7) : ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Java");
                break;
            case 2:
                System.out.println("Python");
                break;
            case 3:
                System.out.println("JScript");
                break;
            case 4:
                System.out.println("JavaScript");
                break;
            case 5:
                System.out.println("Ruby on Rails");
                break;
            case 6:
                System.out.println(".NET");
                break;
            case 7:
                System.out.println("Oracle");
                break;
            default:
                System.out.println("Please enter correct choice...");
        }
        scan.close();
    }
}
