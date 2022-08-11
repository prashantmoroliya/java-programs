public class Example1 {
    public void method1() throws ArithmeticException {
        throw new ArithmeticException("calculation error");
    }
    public void method2() throws ArithmeticException {
        method1();
    }
    public void method3() {
        try {
            method2();
        } catch(ArithmeticException ae) {
            System.out.println("ArithmeticException occured");
        }
    }
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.method3();
        System.out.println("program end...");
    }
}
