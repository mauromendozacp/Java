package java_clase5;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CapaFiguraEvent extends JPanel implements ActionListener {
    JButton BotonAzul = new JButton("AZUL");
    JButton BotonRojo = new JButton("ROJO");
    JButton BotonVerde = new JButton("VERDE");
    
    public CapaFiguraEvent(){
        add(BotonAzul);
        add(BotonRojo);
        add(BotonVerde);
        BotonAzul.addActionListener(this);
        BotonRojo.addActionListener(this);
        BotonVerde.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Object boton = ae.getSource();
        if(BotonAzul == boton){
            setBackground(Color.blue);
        }
        if(BotonRojo == boton){
            setBackground(Color.red);
        }
        if(BotonVerde == boton){
            setBackground(Color.green);
        }
    }
}
