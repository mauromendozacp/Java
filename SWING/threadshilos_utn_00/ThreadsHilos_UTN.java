
package threadshilos_utn_00;

public class ThreadsHilos_UTN {

    public static void main(String[] args) {
        // TODO code application logic here
        HolaRunnable r = new HolaRunnable();
        Thread t = new Thread(r);
        t.start();
        
    }
    
}
