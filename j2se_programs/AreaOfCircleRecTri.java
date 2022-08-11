import java.util.*;

public class AreaOfCircleRecTri {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        // Area of Circle Calculations 
        System.out.print("Enter Radius of Circle = ");
        double radius_of_circle = scan.nextDouble();
        double area_of_circle = 3.14*radius_of_circle*radius_of_circle;

        // Area of Rectangle Calculations
        System.out.print("\nEnter length of Rectangle = ");
        double length_of_rect = scan.nextDouble();
        System.out.print("Enter breadth of Rectangle = ");
        double breadth_of_rect = scan.nextDouble();
        double area_of_rectangle = length_of_rect*breadth_of_rect;

        // Area of Triangle Calculations
        System.out.print("\nEnter height of Triangle = ");
        double height_of_triangle = scan.nextDouble();
        System.out.print("Enter base length of Triangle = ");
        double base_of_triangle = scan.nextDouble();
        double area_of_triangle = 0.5*base_of_triangle*height_of_triangle;

        // Area of Circle
        System.out.println("Area of Circle = "+area_of_circle);
        
        // Area of Rectangle
        System.out.println("Area of Rectangle = "+area_of_rectangle);
        
        // Area of Triangle
        System.out.println("Area of Triangle = "+area_of_triangle);

        scan.close();
    }
}
