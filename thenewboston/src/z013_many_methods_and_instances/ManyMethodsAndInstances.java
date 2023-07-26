package z013_many_methods_and_instances;

import java.util.Scanner;
public class ManyMethodsAndInstances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tuna tunaObject = new tuna();

        System.out.println("Enter name of first gf here: ");
        String temp = scanner.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
    }
}
