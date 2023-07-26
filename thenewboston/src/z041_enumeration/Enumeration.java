package z041_enumeration;

public class Enumeration {
    public static void main(String[] args) {
        for (tuna people: tuna.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
    }
}
