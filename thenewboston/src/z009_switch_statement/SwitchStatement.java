package z009_switch_statement;

public class SwitchStatement {
    public static void main(String[] args) {
        int age;
//        age = 3;
        age = 7;




//        if(age == 1) {
//            System.out.println(...);
//        }
//        if(age == 2) {
//            System.out.println(....);
//        }... blah blah blah... there is better way to do.. switch statement




        switch (age) {
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get in toruble");
                break;
            default:
                System.out.println("I dont know how old you are");
                break;
        }
    }
}
