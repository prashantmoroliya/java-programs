package z065_multiple_selection_list;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] foods = {"bacon", "wings", "ham", "beef", "morebacon"};

    public Gui() {
        super("title");
        setLayout(new FlowLayout());

        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("Move  -->");
        movebutton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rightlist.setListData(leftlist.getSelectedValues());
                    }
                }
        );
        add(movebutton);

    }
}
