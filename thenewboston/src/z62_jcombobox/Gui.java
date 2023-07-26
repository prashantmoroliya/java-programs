package z62_jcombobox;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Gui extends JFrame {
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"b.png", "x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
            new ImageIcon(getClass().getResource(filename[1]))};

    public Gui() {
        super("the title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

    }

}
