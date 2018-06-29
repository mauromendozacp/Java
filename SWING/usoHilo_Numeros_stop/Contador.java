
package usoHilo_Numeros_stop;


public class Contador {
    
   public void contar() throws InterruptedException{
   
       for (int i = 0; i < 10000; i++) {
           System.out.println("contador: "+i);
           Thread.sleep(1000);
       }
       
   }
    
}
