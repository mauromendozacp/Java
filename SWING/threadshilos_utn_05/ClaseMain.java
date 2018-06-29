
package threadshilos_utn_05;

public class ClaseMain {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
       Thread hilo1 = new Thread(new Runner("proceso RunnableThread"));
       hilo1.start();
    }
    
}
