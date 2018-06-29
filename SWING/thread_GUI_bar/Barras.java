
package thread_GUI_bar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Barras {
    
    public JFrame marco;
    public JPanel lamina;
    public JButton boton;
    public JProgressBar barra;
    public Eventos control; //clase interna


    public Barras() {
        
        control = new Eventos(); //clase interna
        marco = new JFrame("ventana de progreso");
        lamina = new JPanel();
        boton = new JButton("Presionar");
        boton.addActionListener(control);
        barra = new JProgressBar(0,100);
        barra.setValue(0);
        barra.setStringPainted(true);
        marco.setLayout(new FlowLayout());
        Marco();
    }
    
    public void Marco(){
    
        lamina.add(barra);
        lamina.add(boton);
        marco.add(lamina);
        marco.setBounds(600, 300, 300, 100);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public class Eventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          
            //new Thread(new Hilo()).start(); //otra forma
            Thread t = new Thread(new Runner()); //INSTANCIA CLASE RUNNER
            t.start();
        }

    }
    
    public class Runner implements Runnable{

        @Override
        public void run() {
 
            int i;
            for (i = 0; i < 100; i++) {
               
                barra.setValue(i);
                barra.repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Barras.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }
             if (i == 100) {
                    System.out.println("Termino proceso..");
                }
        }
    
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Barras b = new Barras();
    }
    
}
