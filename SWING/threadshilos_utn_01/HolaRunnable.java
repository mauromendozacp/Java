
package threadshilos_utn_01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HolaRunnable implements Runnable{ //Runnable es una interface

    int i;
    
    @Override
    public void run() { //implementamos metodo run
        
        i = 0;
        while (true) {            
          
                System.out.println("Hola "+i++);
                if (i == 50) {
                    break;
                }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HolaRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
        
    }
    
}
