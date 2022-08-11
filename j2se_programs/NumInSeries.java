import java.util.*;

public class NumInSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        if(num>100) {
            System.out.println(num+" is greater than 100");
        } else if(num>=90 && num<100){
            System.out.println(num+" lies between 90-100");
        } else if(num>=80 && num<90){
            System.out.println(num+" lies between 80-90");
        } else if(num>=70 && num<80){
            System.out.println(num+" lies between 70-80");
        } else if(num>=60 && num<70){
            System.out.println(num+" lies between 60-70");
        }  else {
            System.out.println(num+" less than 60");
        }

        scan.close();
    }
}
