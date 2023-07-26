package z067_mouse_events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;

    public Gui() {
        super("title");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }

    public class HandlerClass implements MouseListener, MouseMotionListener {
        // these are mouse event
        public void mouseClicked(MouseEvent e) {
            statusbar.setText(String.format("Click at %d, %d", e.getX(), e.getY()));
        }

        public void mousePressed(MouseEvent e) {
            statusbar.setText("You pressed down the mouse");
        }

        public void mouseReleased(MouseEvent e) {
            statusbar.setText("You released the button");

        }

        public void mouseEntered(MouseEvent e) {
            statusbar.setText("You entered the area");
            mousepanel.setBackground(Color.RED);
        }

        public void mouseExited(MouseEvent e) {
            statusbar.setText("The mouse has left the window");
            mousepanel.setBackground(Color.WHITE);
        }

        // these are mouse motion event
        public void mouseDragged(MouseEvent e) {
            statusbar.setText("You are dragging the mouse");
        }

        public void mouseMoved(MouseEvent e) {
            statusbar.setText("You moved the mouse");
        }
    }
}
