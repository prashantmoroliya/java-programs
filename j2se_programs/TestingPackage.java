import pack1.ClassA;
import pack1.ClassB;

public class TestingPackage {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.greet();
        ca.series();

        ClassB cb = new ClassB();
        cb.display();
        System.out.println(cb.add(10, 20));
    }
}
