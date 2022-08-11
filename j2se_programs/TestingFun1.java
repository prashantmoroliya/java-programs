// testing first function type.... no returntype no parameter

public class TestingFun1 {

    public static void indore() {
        System.out.println("Indore is financial capital of MP");
    }

    public void sampleMethods() {
        System.out.println("this is a non-static method");
        System.out.println("it executes with the object of the class");
    }

    public static void main(String[] args) {
        System.out.println("today is Thursday");
        System.out.println("-------------------------------");
        method1();  // invoking of method...
        TestingFun1.bhopal();   // invoking by using class name
        indore();   // invoking without using class name
        // so static UDF can be accessed with or without class name or it's object name...

        System.out.println("-------------------------------");

        // non static method calling...
        TestingFun1 obj = new TestingFun1();
        obj.sampleMethods();    // non static method invoking through class object..
    }

    // no returntype no parameter
    public static void method1() {
        System.out.println("this is static method");
        System.out.println("static method doesn't use object");
        System.out.println("it executes with classname also");
    }
    // no returntype no parameter
    public static void bhopal() {
        System.out.println("Bhopal is capital of MP.");
        System.out.println("Bhopal is famous for its lakes.");
    }
}
