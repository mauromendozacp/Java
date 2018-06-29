package thread_Hilos_GUI;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent; //Es el evento de: MouseMotionListener por eso lo agrego como clase
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Clase_Anonima {  //EL MARCO ES INDEPENDIENTE DE LA ACION DEL HILO
                               //PERO CUANDO PRESIONO UNA SEGUNDA O TERCERA VEZ INICIA OTRO HILO

    private final JFrame marco;

    public Clase_Anonima() { //CONSTRUCTOR

        marco = new JFrame("Ejemplo de Clase Anonima");
    }

    public void marco() {  //METODO PARA AGREGAR COMPONENTES

        JLabel texto = new JLabel("Clickar raton en Marco");

        //agregamos componenetes al marco
        marco.add(texto, BorderLayout.NORTH);

        //AGREGAMOS UN LISTENER O ESCUCHA QUE UTILIZA UNA CLASE ANONIMA 
        //DE LA INTERFACE MOUSEMOTIONLISTENER Y SU CLASE ADAPTADORA
        marco.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println("Clase Anonima dio Click al boton del raton");

                Runnable r = new Runnable() {  //Runnable es abstracta no puede ser instanciar "ANTES IMPLEMENTABA EN UNA CLASE"
                    @Override
                    public void run() {
                        
                        for (int i = 0; i < 80; i++) {
                            System.out.println("Hilo1: " + i);
                            
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Clase_Anonima.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }
                };

                Thread hilo = new Thread(r);
                hilo.start();

                marco.setSize(300, 200);
                marco.setVisible(true);
            }

        });

        marco.setSize(300, 200);
        marco.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Clase_Anonima obj = new Clase_Anonima();
        obj.marco();
    }
    
}
