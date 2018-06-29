/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaencapsulamiento;
import java.util.*;
public class PracticaEncapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona[] pers = new Persona[3];
       pers[0] = new Persona();
       pers[1] = new Persona();
       pers[2] = new Persona();
       int aux = 0;
       Scanner a = new Scanner(System.in);
       aux=a.nextInt();
       pers[0].setDni(aux);
       pers[0].setDni(aux);
       pers[0].setNomb("Mauro Mendoza");
       pers[0].setEdad(18);
       
       
       
    }
    
}
