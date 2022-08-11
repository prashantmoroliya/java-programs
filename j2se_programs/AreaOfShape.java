import java.util.*;

class Shape {
    double radius, length, breadth;

    public double circle(double radius) {
        this.radius = radius;
        return 3.14*radius*radius;
    }

    public double triangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        return (length*breadth)/2;
    }

    public double rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        return length*breadth;
    }
}

public class AreaOfShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Shape sp = new Shape();
        double radius, length, breadth, aotc, aott, aotr;
        
        System.out.print("Enter radius of circle = ");
        radius = scan.nextDouble();
        System.out.print("Enter height of triangle = ");
        length = scan.nextDouble();
        System.out.print("Enter base of triangle = ");
        breadth = scan.nextDouble();
        System.out.print("Enter length of rectangle = ");
        length = scan.nextDouble();
        System.out.print("Enter breadth of rectangle = ");
        breadth = scan.nextDouble();

        aotc = sp.circle(radius);
        aott = sp.triangle(length, breadth);
        aotr = sp.rectangle(length, breadth);

        System.out.println("Area of Circle    : "+aotc);
        System.out.println("Area of Triangle  : "+aott);
        System.out.println("Area of Rectangle : "+aotr);

        System.out.println("------------------------------------------------------------------------------");

        System.out.printf("Area of Triangle = ",aott);

        scan.close();
    }
}
