package thread_GUI_bar2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Barras implements ActionListener,Runnable{

    public JFrame marco;
    public JPanel lamina;
    public JButton boton1;
    public JButton boton2;
    Thread hilo;
    boolean contadorActivo;
    

    public Barras() {

        marco = new JFrame("ventana de progreso");
        lamina = new JPanel();
        boton1 = new JButton("Presionar");
        boton1.addActionListener(this);

        boton2 = new JButton( "Reiniciar" );
        boton2.addActionListener( this );
        
        marco.setLayout(new FlowLayout());
//        Marco();
    }

    public void Marco() {

        lamina.add(boton1);
        marco.add(lamina);
        
        lamina.add(boton2);
        marco.add(lamina);

        marco.setBounds(600, 300, 300, 100);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent ae) {

        Object o = ae.getSource();
        if (o instanceof JButton) {

            JButton btn = (JButton) o;
            if (btn.getText().equals("Presionar")) {               
                iniciarCronometro();

            }
            
            if( btn.getText().equals("Reiniciar") ) {
                pararCronometro();

            }
        }
    }

    public void iniciarCronometro() {
        contadorActivo = true;
        hilo = new Thread(this);
        hilo.start();
    }
    
    public void pararCronometro(){
        contadorActivo = false;
    }

        @Override
        public void run() {

            while (contadorActivo) {

                for (int j = 0; j < 10; j++) {
                    System.out.println("Contando: "+j);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Barras.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            /**
             * *obtenemos la referencia al hilo actual con metodo currentThread()*
             */
            System.out.println("El hilo " + Thread.currentThread().getName() + " ha terminado");

        }

       

    public static void main(String[] args) {
        // TODO code application logic here
        Barras b = new Barras();
        b.Marco();
    }

}
