
package threadshilos_utn_01;

public class ThreadsHilos_UTN_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        HolaRunnable r = new HolaRunnable();
        Thread t = new Thread(r);
        t.start();
        
    }
    
}
