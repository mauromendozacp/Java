
package ThreadHiloCalc;

public class HiloSuma implements Runnable{
    
    private String nombre;
    private int num[];
    
    private static CalculoSynchronized calc = new CalculoSynchronized(); //INSTANCIA DE LA CLASE

    public HiloSuma(String nombre, int num[]) { //CONSTRUCTOR DE LA CLASE
        this.nombre = nombre;
        this.num = num;
     //  new Thread(this, nombre).start(); //es lo mismo que lo de abajo
        Thread tr = new Thread(this, nombre);
        tr.start();
    }

    @Override
    public void run() {
        
        System.out.println(nombre+"Inicio");
        int suma = calc.sumaArray(this.num); //this.num = atributo de clase
         System.out.println("Resultado de la suma para hilo: "+this.nombre+" es: "+suma);
         System.out.println(nombre+"final");
        
    }
    
    
    
}
