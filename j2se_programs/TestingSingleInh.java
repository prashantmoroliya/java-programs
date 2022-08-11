class Base {
    public void greet() {
        System.out.println("very good morning");
    }

    public void show() {
        System.out.println("java language");
        System.out.println("after that python");
    }
    public void one() {
        System.out.println("this is base class fun");
    }
}

class Derived extends Base {
    public void display() {
        show();     // nested method...
        System.out.println("machine language");
        System.out.println("deep learning");
    }
    public void one() {
        super.one();
        System.out.println("this is derived class fun");
    }
}

public class TestingSingleInh {
    public static void main(String[] args) {
        Derived dd = new Derived();
        dd.greet();
        // dd.show();
        dd.display();
        dd.one();        
    }
}
