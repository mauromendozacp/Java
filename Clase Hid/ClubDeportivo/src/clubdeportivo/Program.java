package clubdeportivo;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Archivo arc = new Archivo();
        Scanner read = new Scanner(System.in);
        int opc;
        do{
            System.out.print("\nMenu Principal\n\n1- Alta Deporte\n2- Alta Asociado\n3- Ver Deporte\n4- Ver Asociado\n5- Salir\n\ningrese opcion: ");
            opc = read.nextInt();
            switch(opc){
                case 1: arc.CrearDeporte();
                    break;
                case 2: arc.CrearAsociado();
                    break;
                case 3: arc.LeerDeporte();
                    break;
                case 4: arc.LeerAsociado();
                    break;
                case 5: System.out.print("Adios :3");
                    break;
                default: System.out.print("error ingrese nuevamente: ");
                    break;
            }
        } while(opc != 5);
    }
    
}
