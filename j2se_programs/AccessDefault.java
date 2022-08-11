class A {
    void display() {
        System.out.println("this is a default method");
    }
}

class AccessDefault {
    public static void main(String[] args) {
        A aa = new A();
        aa.display();
    }
}
