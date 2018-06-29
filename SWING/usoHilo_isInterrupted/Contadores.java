
package usoHilo_isInterrupted;



public class Contadores {
    
   public void contar() throws InterruptedException{ //metodo contador
       
       int contador = 0;
       
       if (Thread.currentThread().isInterrupted()== false) { //para saber si inicio hilo
           System.out.println("Iniciando Hilo ");
       }
       
       while (!Thread.currentThread().isInterrupted()) {  //while que permite contar     
           
           contador = contador +1;
           System.out.println("contador: "+contador);
       }
       
       if (Thread.currentThread().isInterrupted()== true) {
           System.out.println("Hilo Detenido ");
       }
       
   }
    
}
