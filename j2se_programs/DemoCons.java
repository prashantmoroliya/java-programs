class Emp1 {
    String name;
    int age;
    float sal;

    // default constructor...
    Emp1() {
        name = "Anakin";
        age = 25;
        sal = 1124214.21f;
    }

    public void show() {
        System.out.println("my name is = "+name);
        System.out.println("my  age is = "+age);
        System.out.println("my  sal is = "+sal);
    }
}

public class DemoCons {
    public static void main(String[] args) {
        Emp1 ee = new Emp1();
        ee.show();
    }
}
