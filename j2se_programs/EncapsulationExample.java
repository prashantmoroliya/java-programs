import java.util.*;

class Emp {
    String name;
    int age;
    float sal;

    // public void getData(String nm, int ag, float sl)  {
    //     name = nm;
    //     age = ag;
    //     sal = sl;
    // }
    // or can also be written as...
    public void getData(String nm, int ag, float sl)  {
        this.name = nm;
        this.age = ag;
        this.sal = sl;
    }

    public void show() {
        System.out.println("my name is = "+name);
        System.out.println("my  age is = "+age);
        System.out.println("my  sal is = "+sal);
    }
    public void calc() {
        float ann_sal;
        ann_sal = sal*12;
        System.out.println("my ann_sal is = "+ann_sal);
    }
}

class EncapsulationExample {
    public static void main(String args[]) {
        Emp ee = new Emp();
        
        Scanner scan = new Scanner(System.in);

        String nm[] = new String[3];
        int ag[] = new int[3];
        float sl[] = new float[3];
        
        for(int i=0; i<3; i++) {
            System.out.println("Enter Employee name : ");
            nm[i] = scan.nextLine();
            System.out.println("Enter Employee age  : ");
            ag[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter Employee sal  : ");
            sl[i] = scan.nextFloat();
            scan.nextLine();
        }
        System.out.println("----------------------------");
        for(int i=0; i<3; i++) {
            ee.getData(nm[i], ag[i], sl[i]);
            ee.show();
            ee.calc();
        }
        System.out.println("----------------------------");
        scan.close();
    }
}
