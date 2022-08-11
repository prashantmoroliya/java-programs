import java.util.*;

public class UserInput {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        String qual;
        double exp_sal;

        System.out.print("Enter your name   = ");
        name = scan.nextLine();
        System.out.print("Enter your qual   = ");
        qual = scan.nextLine();
        System.out.print("Enter your age    = ");
        age = scan.nextInt();
        System.out.print("Enter your expsal = ");
        exp_sal = scan.nextDouble();
        System.out.println("--------My Details--------");
        System.out.println("name = "+name);
        System.out.println("age = "+age);
        System.out.println("qual = "+qual);
        System.out.println("--------------------------");
        System.out.println("exp sal = "+exp_sal);
        System.out.println("--------------------------");

        scan.close();
    }
}
// import java.io.*;

// public class UserInput {
//     public static void main(String args[]){
//         BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
//         String name;
//         int age;
//         String qual;
//         double exp_sal;

//         System.out.print("Enter your name   = ");
//         name = scan.readLine();
//         System.out.print("Enter your age    = ");
//         age = Integer.parseInt(scan.readLine());
//         System.out.print("Enter your qual   = ");
//         qual = scan.readLine();
//         System.out.print("Enter your expsal = ");
//         exp_sal = scan.read();
//         System.out.println("--------My Details--------");
//         System.out.println("name = "+name);
//         System.out.println("age = "+age);
//         System.out.println("qual = "+qual);
//         System.out.println("--------------------------");
//         System.out.println("exp sal = "+exp_sal);
//         System.out.println("--------------------------");      
//     }
// }
