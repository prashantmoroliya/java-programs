package z043_static;

public class tuna {
     private String first;
     private String last;
     private static int members = 0;

     public tuna (String fn, String ln) {
         first = fn;
         last = ln;
         members++;
         System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
     }
}
