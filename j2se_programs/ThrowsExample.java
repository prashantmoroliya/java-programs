import java.io.IOException;

public class ThrowsExample {
    public void myMethod(int num) throws IOException, ClassNotFoundException{
        if(num == 1){
            throw new IOException("IOException found");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException found");
        }
    }
    public static void main(String[] args) {
        try {
            ThrowsExample te = new ThrowsExample();
            te.myMethod(1);
            //te.myMethod(11);
        } catch(Exception ee) {
            System.out.println(ee);
        }
    }
}
