package z61_jradiobutton;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Gui extends JFrame {
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public Gui() {
        super("the title");
        setLayout(new FlowLayout());

        tf = new JTextField("Do or Do Not, There Is No Try.", 25);
        add(tf);

        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", false);
        ib = new JRadioButton("italic", false);
        bib = new JRadioButton("bold and italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

        tf.setFont(pf);

        //wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }

    private class HandlerClass implements ItemListener {
        private Font font;

        //the font object get variable font
        public HandlerClass(Font f) {
            font = f;
        }

        //sets the font to the font object that was passed in
        public void itemStateChanged(ItemEvent e) {
            tf.setFont(font);
        }
    }
}
