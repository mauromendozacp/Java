
package ThreadHiloCalc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculoSynchronized {
    
    private int suma;
    
    public synchronized int sumaArray(int array[]){  //METODO SUMA ARRAY DE TIPO "SYNCHRONIZED" RECIBIENDO ARGUMENTO
    
        suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            suma = suma + array[i];
            
            System.out.println("Ejecutando una suma: "+Thread.currentThread().getName()+" valor "+array[i]+" con total: "+suma);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CalculoSynchronized.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return suma;
    }
    
}
