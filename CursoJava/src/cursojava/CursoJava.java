package cursojava;
import java.util.*;
/**
 *
 * @author ari08
 */
public class CursoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = 0, edad, max = 0, min = 0, cant1 = 0, cant2 = 0;
        float prom1 = 0, prom2 = 0;
        
        do {
            System.out.print("\nPersona " + (i+1));
            System.out.print("\nIngrese edad: ");
            edad = a.nextInt();
            if(edad>=18) {
                cant1++;
            }
            if(edad<18) {
                cant2++;
            }
            i++;
            prom1 = ((float)cant1 * 100) / i;
            prom2 = ((float)cant2 * 100) / i;
            if(edad > max || i == 0){
                max=edad;
            }
            if(edad < min || i == 0){
                min=edad;
            }
        } while(i<5);
        //Ordenar(edad);
        System.out.print("\nPersonas mayores a 18:\nCantidad: " + cant1 + "\nPorcentaje: " + prom1);
        System.out.print("\nPersonas menores a 18:\nCantidad: " + cant2 + "\nPorcentaje: " + prom2);
        System.out.print("\n"+ "Edad Mayor: " + max + "\nEdad Minima: " + min);       
    }
}
    /*public static void Ordenar(int[] edad) {
        int aux;
        for(int i=0;i<edad.length;i++){
            for(int j=1;j<edad.length+1;j++){
                if(edad[i]<edad[j]){
                    aux = edad[i];
                    edad[i] = edad[j];
                    edad[j] = aux;
                }
            }
        }
    }*/
