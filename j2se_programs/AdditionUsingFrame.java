import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionUsingFrame {
    public static void main(String[] args) {
        Addition add = new Addition();
    }
}

class Addition extends JFrame implements ActionListener {
    JFrame jf = new JFrame();

    JLabel labelOne, labelTwo, labelThree;
    JTextField textOne, textTwo;
    JButton btn;

    public Addition() {
        setLayout(new FlowLayout());
        labelOne = new JLabel("First Number");
        textOne = new JTextField(20);
        labelTwo = new JLabel("Second Number");
        textTwo = new JTextField(20);

        btn = new JButton("Addition");

        labelThree = new JLabel("Result");

        add(labelOne);
        add(textOne);
        add(labelTwo);
        add(textTwo);
        add(btn);
        add(labelThree);

        btn.addActionListener(this);

        setVisible(true);
        setSize(250, 400);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(textOne.getText());
        int num2 = Integer.parseInt(textTwo.getText());

        int value = num1+num2;
        labelThree.setText(""+value);
    }
}
