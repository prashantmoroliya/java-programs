class Cons { 
    int a;
    float b;
    double c;

    Cons() {
        a=10;
        b=20.0f;
        c=30;
    }
    public void show() {
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("Value of c = "+c);
    }
}

public class ConsDemo {
    public static void main(String[] args) {
        Cons co = new Cons();
        co.show();
    }
}
