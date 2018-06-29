package java_clase5;
import javax.swing.*;
import java.awt.BorderLayout;

public class Marco extends JFrame {
    public Marco(){
        setVisible(true);
        setBounds(600,300,600,300);
        CapaFiguraEvent cfp = new CapaFiguraEvent();
        add(cfp, BorderLayout.CENTER);
    }
}
