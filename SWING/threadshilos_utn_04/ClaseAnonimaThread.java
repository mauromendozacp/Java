
package threadshilos_utn_04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseAnonimaThread {

    public static void main(String[] args) {
        
          /******CLASE ANONIMA********/
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("Hilo Anonimo: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ClaseAnonimaThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        Thread hilo = new Thread(r2);
        hilo.start();
            
    }
    
}
