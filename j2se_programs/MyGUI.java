import java.awt.FlowLayout;

import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(300, 300);
        frame.setBounds(20, 30, 300, 100);
        JButton btn = new JButton("Click");
        JButton btnAlt = new JButton("Hello");
        frame.getContentPane().add(btn);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(btnAlt);
        frame.setVisible(true);
    }
}
