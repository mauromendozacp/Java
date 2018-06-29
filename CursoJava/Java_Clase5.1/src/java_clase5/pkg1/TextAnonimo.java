package java_clase5.pkg1;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAnonimo {
    private JFrame f;
    private JTextField tf;
    
    public TextAnonimo(){
        f = new JFrame("Marco");
        tf = new JTextField(30);
    }
    
    public void MostrarFrame(){
        JLabel label = new JLabel("Label");
        f.add(label, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        f.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseDragged(MouseEvent me) {
                String s="Arrrastre el mouse\n x= " + me.getX() + " y= " +me.getY();
                tf.setText(s);
            }
        });    
        
        f.addMouseListener(new MouseClickHandler());
        f.setSize(200, 300);
        f.setVisible(true);
    }
}
