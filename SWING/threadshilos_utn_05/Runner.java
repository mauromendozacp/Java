
package threadshilos_utn_05;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner implements Runnable{

    private final String Hilo1;
    
    public Runner(String Hilo1) { //CONSTRUCTOR
        
        this.Hilo1 = Hilo1;
  
    }
    
    
    
    @Override
    public void run(){ //METODO RUN "ESCRITO SOBRE ESCRITO" EJECUTA 50 VECES EL HILO1
        
        for (int i = 0; i < 30; i++) { 
            System.out.println("Hilo 1: "+Hilo1+" nº "+i);
            try {
                Thread.sleep(200); //2 segundos o 2000 milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            System.out.println("");
    }
    
}
