package z053_polymorphic_arguments;

public class PolymorphicArguments {
    public static void main(String[] args) {
        fatty bucky = new fatty();
        food fo = new food();
        food po = new potpie();

        bucky.digest(fo);
        bucky.digest(po);
    }
}
