package z048_gui_with_jframe;

import javax.swing.JFrame;
public class GUIWithJFrame {
    public static void main(String[] args) {
        tuna bucky = new tuna();

        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bucky.setSize(275, 180);
        bucky.setVisible(true);
    }
}
