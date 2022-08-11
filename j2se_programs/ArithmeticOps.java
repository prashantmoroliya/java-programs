import java.util.*;
public class ArithmeticOps {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value a = ");
        int a = scan.nextInt();
        System.out.print("Enter value b = ");
        int b = scan.nextInt();

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        float div = a/b;

        System.out.println("Add = "+add);
        System.out.println("Sub = "+sub);
        System.out.println("Mul = "+mul);
        System.out.println("Div = "+div);

        scan.close();
    }
}
