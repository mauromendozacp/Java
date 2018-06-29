
package threadshilos_utn_02;

import java.util.logging.Level;
import java.util.logging.Logger;

class Runner implements Runnable{

    private boolean abandonarTiempo = false;
    int i;
    
    @Override
    public void run() {
        
         i = 0;
        while (!abandonarTiempo) {            
          
                System.out.println("Hola "+i++);
                if (i == 50) {
                    break;
                }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        /***obtenemos la referencia al hilo actual con metodo currentThread()**/
        System.out.println("El hilo "+Thread.currentThread().getName()+" ha terminado");
        
    }
    
    public void stopRunning(){ //metodo parar Running
    
        abandonarTiempo = true;
        System.out.println("Stop Hilo");
    }
}
