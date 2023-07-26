package z012_use_methods_with_parameters;

import java.util.Scanner;
public class UseMethodsWithParameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tuna tunaObject = new tuna();

        System.out.println("Enter your name here: ");
        String name = scanner.nextLine();

        tunaObject.simpleMessage(name);
    }
}
