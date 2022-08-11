import javax.swing.*;

public class JComboBoxDemo {
    JFrame f;
    JComboBoxDemo() {
        f = new JFrame("ComboBox Example");
        String country[] = {"Pune", "New Delhi", "Bhopal", "Indore", "Ujjain"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxDemo();
    }
}
