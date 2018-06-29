
package clases_internas_static;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseInternaRunner {

    public static void main(String[] args){
        // TODO code application logic here
        /*****HILO RUNNABLE IMPLEMENTADO CLASE INTERNA**/
       Runnable r = new RunnableImpl("proceso Clase interna");
       Thread hilo1 = new Thread(r);
       hilo1.start();
      
    }
    
    /***** CLASE INTERNA RUNNABLE DE TIPO STATIC****/
    private static class RunnableImpl implements Runnable {

        private final String Hilo2;
        public RunnableImpl(String Hilo2) {
            
            this.Hilo2 = Hilo2;
        }

        @Override
        public void run() {
            
            for (int i = 0; i < 50; i++) { 
            System.out.println("Hilo 2: "+Hilo2+" nº "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClaseInternaRunner.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            System.out.println("");
        }
    }
    
}
