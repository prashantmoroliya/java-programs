package z052_introduction_to_polymorphism;

public class IntrodcutionToPolymorphism {
    public static void main(String[] args) {

//        tuna bucky = new tuna();
//        food bucky = new tuna();

        food bucky[] = new food[2];
        bucky[0] = new potpie();
        bucky[1] = new tuna();

        for (int x=0; x<2; x++) {
            bucky[x].eat();
        }
    }
}
