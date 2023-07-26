package z044_more_on_static;

public class MoreOnStatic {
    public static void main(String[] args) {
        tuna member1 = new tuna("Megan", "Fox");
        tuna member2 = new tuna("Natalie", "Portman");
        tuna member3 = new tuna("Taylor", "Swift");

//        System.out.println();
//        System.out.println(member1.getFirst());
//        System.out.println(member1.getLast());
//        System.out.println(member1.getMembers());
//
//        System.out.println(member2.getFirst());
//        System.out.println(member2.getLast());
//        System.out.println(member2.getMembers());
//
//        System.out.println(member3.getFirst());
//        System.out.println(member3.getLast());
//        System.out.println(member3.getMembers());

        System.out.println(tuna.getMembers());
    }
}
