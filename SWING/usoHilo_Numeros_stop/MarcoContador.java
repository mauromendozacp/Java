
package usoHilo_Numeros_stop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MarcoContador{
    
    Thread t1;
    JButton iniciar1;
    JButton stop1;
    JPanel laminaBotones;
    JFrame marco;

    public MarcoContador() {
        
        marco = new JFrame();
        marco.setBounds(300, 300, 200, 100);
        marco.setTitle("contar");
      
        laminaBotones = new JPanel(); //segunda lamina o capa para botones

        /**
         * *******************BOTON_INICIAR_1***************************
         */
        iniciar1 = new JButton("Hilo_1");
        iniciar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {

                comienza_el_conteo(evento);
            }
        });
        
        /**
         * *******************BOTON_DETENER_1***************************
         */
        stop1 = new JButton("Stop_1");
        stop1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {

                detener(evento);
            }
        });
        laminaBotones.add(stop1);

        
        laminaBotones.add(iniciar1);
        marco.add(laminaBotones);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
  
    public void comienza_el_conteo(ActionEvent e) { //pasamos por parametro un evento

        Contador contador = new Contador(); //Instancia del contador
       
         Runnable r = new ContadorHilos(contador); //variable de tipo runnable

        if (e.getSource().equals(iniciar1)) { //si el evento procede del boton1 "iniciar1" hacer esto

            t1 = new Thread(r); //creo una tarea que es iniciar el juego
            t1.start(); //inicie la tarea llamando al metodo " run() "
        } 
    }
    
     public void detener(ActionEvent e) {

        if (e.getSource().equals(stop1)) {

            t1.stop(); //solicitud de detencion del hilo
        } 

        /**
         * SI ACTIVO TRES CONTADORES LA PRIMERA "t" PASARA A LA SEGUNDA Y AL
         * ACTIVAR LA TERCERA PASARA LA "t" A ESTA TERCERA POR LO CUAL SOLO ESTA
         * ULTIMA SERA LA QUE TENDRA EL CONTROL, ESTO SE SOLUCIONA CREANDO
         * VARIAS INSTANCIAS CON DIFERENTES NOMBRES PERTENECIENTES A LA CLASE
         * THREADS, CREANDO UN BOTON PARA CADA HILO*
         */
        /**
         * *SOLO UN HILO "t" SE DETENDRA LOS OTROS QUEDARAN**
         */
    }
    
}
