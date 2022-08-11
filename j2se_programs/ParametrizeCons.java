class EmpData {
    String name;
    int code;
    double sal;

    EmpData() {
        name = "Kumar Sanu";
        code = 60;
        sal = 123532532;

    }

    EmpData(String name, int code, double sal) {
        this.name = name;
        this.code = code;
        this.sal = sal;
    }

    public void display() {
        System.out.println("Employee Name   = "+name);
        System.out.println("Employee Code   = "+code);
        System.out.println("Employee Salery = "+sal);
    }
}

public class ParametrizeCons {
    public static void main(String[] args) {
        EmpData ed = new EmpData("KK", 53, 500000000000.0000);
        ed.display();
        System.out.println("-------------------------------------------------");
        EmpData ed1 = new EmpData("Kailash Kher", 55, 500000.0000);
        ed1.display();
        System.out.println("-------------------------------------------------");
        EmpData ed2 = new EmpData("Sonu Nigam", 52, 500000000.0000);
        ed2.display();
        System.out.println("-------------------------------------------------");
        EmpData ed3 = new EmpData();
        ed3.display();
    }
}
