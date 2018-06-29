
package usoHilo_Numeros_stop;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ContadorHilos implements Runnable{

    private final Contador cont;

    public ContadorHilos(Contador cont) {
        this.cont = cont;
   
    }
    
    @Override
    public void run() {
        
        try {
            cont.contar();
        } catch (InterruptedException ex) {
            Logger.getLogger(ContadorHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
