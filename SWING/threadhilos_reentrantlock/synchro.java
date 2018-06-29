
package threadhilos_reentrantlock;
//Bloque J. Concurrente 5.2: ReentrantLock (Empieza A Programar)

import java.util.concurrent.locks.ReentrantLock;

public class synchro implements Runnable{
    
    private static int cont = 0;
    private static ReentrantLock cerrojo = new ReentrantLock(); //cerrojo

    @Override
    public void run() {
        
             cerrojo.lock();
        try {
            for (int i = 0; i < 200000; i++) {
                
                cont++;
            }
        } finally {
            cerrojo.unlock();
        }
    }
    
    public static int getCont(){ //devuelve el valor
    
        return cont;
    }
    
}
