package z048_gui_with_jframe;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tuna extends JFrame {
    private JLabel item1;

    public tuna() {
        super("The title bar");     // title
        setLayout(new FlowLayout());    // it is the layout

        item1 = new JLabel("this is a sentecew");
        item1.setToolTipText("This is gona show up on hover");
        add(item1);
    }
}
