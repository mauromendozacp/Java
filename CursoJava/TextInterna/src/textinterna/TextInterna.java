package textinterna;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextInterna {

    private JFrame f;
    private JTextField tf;
    
    public TextInterna(){
        f = new JFrame("Marco");
        tf = new JTextField(30);
    }
    class MyMouseMotionListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent me) {
            String s="Arrrastre el mouse\n x= " + me.getX() + " y= " +me.getY();
            tf.setText(s);
        }
    }
    class MouseClickHander extends MouseAdapter {
        public void mouseClicked(MouseEvent me) {
            System.out.print("dio click aqui xd");
        }
    }
    class MouseReleased extends MouseAdapter{
        
    }
    public void Marco(){
        JLabel label = new JLabel();
        f.add(label, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        f.addMouseMotionListener(new MyMouseMotionListener());
        f.addMouseListener(new MouseClickHander());
        f.setVisible(true);
        f.setSize(300, 200);
    }
    
    public static void main(String[] args) {
        TextInterna obj = new TextInterna();
        obj.Marco();
        
    }
    
}
