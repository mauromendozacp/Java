
package threadshilos_utn_00;

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
        }
        
    }
    
}
