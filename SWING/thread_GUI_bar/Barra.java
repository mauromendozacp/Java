package thread_GUI_bar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Barra extends JFrame {

    JProgressBar current;
    int num = 0;

    public Barra() {
        super("Progress");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        pane.add(current);
        setContentPane(pane);
    }

    public void iterate() {
        while (num < 2000) {
            current.setValue(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            num += 95;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Barra frame = new Barra();
        frame.pack();
        frame.setVisible(true);
	frame.iterate();
    }

}
