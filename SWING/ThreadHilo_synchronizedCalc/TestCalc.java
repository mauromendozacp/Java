
package ThreadHiloCalc;

public class TestCalc {

    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {1,2,3,4,5}; //la suma es 15
        HiloSuma h1 = new HiloSuma("nº1",array); //sin synchronized se cruzan los hilos aleatoriamente segun S.O 
        HiloSuma h2 = new HiloSuma("nº2",array); //pero con synchronized da prioridad a uno y luego al otro ordenados
    }
    
}
