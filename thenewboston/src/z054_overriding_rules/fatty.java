package z054_overriding_rules;

public class fatty {

//    food fo = new food();   // it will be error.. bcz we can't use food class bcz it is abstract

    public void digest(food x) {
        x.eat();
    }
}
