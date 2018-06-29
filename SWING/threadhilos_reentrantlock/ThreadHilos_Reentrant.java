
package threadhilos_reentrantlock;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHilos_Reentrant {

    public static void main(String[] args) {
      
        Runtime runtime = Runtime.getRuntime();
        int nucleos = runtime.availableProcessors();
        
        //REENTRANTLOCK
        Thread vec[] = new Thread[nucleos];
        
        lanzarReentrant(vec);
        esperarHilos(vec);
        System.out.println("Reentrant: "+synchro.getCont());
                
    }
    
    private static void lanzarReentrant(Thread vec[]){
    
        for (int i = 0; i < vec.length; i++) {
            Runnable run = new synchro();
            vec[i]= new Thread(run);
            vec[i].start();
        }
        
    }
    
    
    private static void esperarHilos(Thread vec[]){
    
        for (int i = 0; i < vec.length; i++) {
           
            try {
                vec[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadHilos_Reentrant.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
