import java.awt.*;
import java.applet.*;

public class HelloWorldApplet extends Applet {
    public void init(){

    }

    public void paint(Graphics g) {
        g.drawString("MyApplet", 30, 40);
    }
}
