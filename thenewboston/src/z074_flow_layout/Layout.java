package z074_flow_layout;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Layout extends JFrame {
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public Layout() {
        super("the title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // left stuff in here
        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );

        // center stuff in here
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        // right stuff in here
        rb = new JButton("right");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );
    }
}
