package z047_graphical_user_interface_gui;

import javax.swing.JOptionPane;
public class GraphicalUserInterfaceGUI {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane
                .showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);

    }
}
