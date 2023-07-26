package z051_event_handler_program;

import javax.swing.JFrame;

public class EventHandlerProgram {
    public static void main(String[] args) {
        pompom pompomObj = new pompom();
        pompomObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pompomObj.setSize(350, 100);
        pompomObj.setVisible(true);
    }
}
