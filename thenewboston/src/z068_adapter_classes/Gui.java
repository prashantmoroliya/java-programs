package z068_adapter_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame {
    private String details;
    private JLabel statusbar;

    public Gui() {
        super("title");

        statusbar = new JLabel("this is default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
    }

    private class MouseClass extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            details = String.format("You clicked %d ", e.getClickCount());

            if (e.isMetaDown()) {
                details += "with right mouse button";
            }
            else if (e.isAltDown()) {
                details += "with center mouse button";
            }
            else {
                details += "with left mouse button";
            }

            statusbar.setText(details);
        }
    }
}
