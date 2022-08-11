import java.util.*;

public class CashMemo {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item name = ");
        String itemname = scan.nextLine();
        System.out.print("Enter item rate = ");
        double itemrate = scan.nextDouble();
        System.out.print("Enter quantity of the item = ");
        int itemqnty = scan.nextInt();

        double totammt = itemrate*itemqnty;

        System.out.println("----------CashMemo----------");
        System.out.println("Item name     : "+itemname);
        System.out.println("Item rate     : "+itemrate);
        System.out.println("Item Quantity : "+itemqnty);
        System.out.println("----------------------------");
        System.out.println("Total Amount  : "+totammt);
        System.out.println("----------------------------");

        scan.close();
    }
}
