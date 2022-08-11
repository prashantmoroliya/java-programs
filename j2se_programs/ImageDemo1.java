import javax.swing.*;

public class ImageDemo1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(2560, 1440);
        JLabel jl = new JLabel();
        ImageIcon obj = new ImageIcon("C:/Users/prash/Pictures/ford_mustang.jpg");
        jl.setIcon(obj);
        jf.add(jl);
        jf.setVisible(true);
    }    
}
