
package threadshilos_utn_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlDeHilos implements ActionListener{

    JFrame marco;
    JButton boton1;
    JButton boton2;
    JPanel lamina;
    
    public ControlDeHilos() {
       
        marco = new JFrame();
        boton1 = new JButton("boton iniciar");
        boton2 = new JButton("boton finalizar");
        lamina = new JPanel();
    }
    
    public void marco(){
    
        marco.setBounds(600, 300, 300, 100);
        lamina.add(boton1);
        lamina.add(boton2);
        marco.add(lamina);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    
     Runner r1 = new Runner(); //clase Runner
     Thread t = new Thread(r1);
    
//    public void startHilo(){
//        t.start();
//    }
    
//    public void stopHilo(){
//        r1.stopRunning();
//        
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == boton1) {
          
            t.start();
        }else if(ae.getSource()== boton2){
        
            r1.stopRunning();
        }
    }
    
}
