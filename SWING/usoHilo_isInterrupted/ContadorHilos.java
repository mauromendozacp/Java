
package usoHilo_isInterrupted;

import java.util.logging.Level;
import java.util.logging.Logger;

/*****ENVIARA UNA EXCEPCION: sep 11, 2017 1:08:33 PM usoHilo_Interrupt.ContadorHilos run
GRAVE: null
java.lang.InterruptedException: sleep interrupted***/

public class ContadorHilos implements Runnable{

    private final Contadores cont;

    public ContadorHilos(Contadores cont) {
        this.cont = cont;
   
    }
    
    @Override
    public void run() {
        
        try {
            cont.contar();
        } catch (InterruptedException ex) {
            Logger.getLogger(ContadorHilos.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println("Ejecutando la Interrupcion");
            //System.exit(0);
        }

    }
    
}
