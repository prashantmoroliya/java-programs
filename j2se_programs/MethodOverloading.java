import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MethodOverloading mo = new MethodOverloading();

        // System.out.println("enter first number to add : ");
        // float num1 = scan.nextInt();
        // System.out.println("enter second number to add : ");
        // float num2 = scan.nextInt();
        // System.out.println("enter third number to add : ");
        // float num3 = scan.nextInt();

        System.out.println("add of x and y is = "+mo.add(10, 20));
        System.out.println("add of x is = "+mo.add(1.5f));
        System.out.println("add of x, y and z is = "+mo.add(10, 20, 30));

        scan.close();
    }

    public int add(int x, int y) {
        return x+y;
    }

    public float add(float x) {
        return x+x;
    }

    public int add(int x, int y, int z) {
        return x+y+z;
    }
}
