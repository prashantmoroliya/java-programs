package z075_drawing_graphics;

import javax.swing.*;
import java.awt.*;

public class Peach extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(190, 81, 215));
        g.fillRect(25, 65, 100, 30);

        g.setColor(Color.RED);
        g.drawString("Do or Do Not, There is No Try.", 25, 120);
    }
}
