package clubdeportivo;

import java.io.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Archivo{
    static int i = 0;
    public void CrearDeporte(){
        /*----VARIABLES----*/
        int intCodDeporte;
        String strDescripcion;
        float floatValorCuota;   
        
        DataOutputStream reg = null;
        
        try{
            Scanner valor = new Scanner(System.in);
            Scanner valor2 = new Scanner(System.in);
            reg = new DataOutputStream(new FileOutputStream ("C:\\Users\\Mauro\\Documents\\Deporte.txt")); //Guardamos el archivo en la direccion de memoria c:
            System.out.println("\033[31m");
            System.out.print("\033[31mINGRESE CODIGO DE DEPORTE : ");
            intCodDeporte = valor.nextInt();
            System.out.print(intCodDeporte);
            if(intCodDeporte != 0) // Si el codigo de deporte es distinto a 0, guarda lo valores.
            {             
                reg.writeInt(intCodDeporte); //Escribimos en el archivo
                
                System.out.print("INGRESE DESCRIPCION : ");
                strDescripcion = valor2.nextLine();
                reg.writeBytes(strDescripcion); //Escribimos en el archivo
                System.out.print(strDescripcion);
                System.out.print("INGRESE EL VALOR CUOTA : ");
                floatValorCuota = valor.nextFloat();
                reg.writeFloat(floatValorCuota);  //Escribimos en el archivo                                   
            }
            else // Si el codigo de deporte es 0 se cierra el guardado de datos.
            {
                System.out.println("\033[31mLA CARGA DE DATOS HA FINALIZADO . . .");
            }
        }
        catch(IOException ex)
        {
            System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
        }
        finally
        {
            try
            {
                reg.close(); //Cerramos el regristro.
            }
            catch(IOException e)
            {
                e.printStackTrace(); //Mostramos un mensaje de error.
            }
        }
    }
    public void CrearAsociado(){
        /*----VARIABLES----*/
        int intCodAsociado;
        String strApellido;
        String strNombre;
        int intEdad;
        int intCodDeporte;
        
        DataOutputStream reg = null;
        
        try{
            Scanner valor = new Scanner(System.in);
            reg = new DataOutputStream(new FileOutputStream ("C:\\Users\\Mauro\\Documents\\Asociado.txt")); //Guardamos el archivo en la direccion de memoria c:
            
            System.out.println("\033[31m");
            System.out.print("\033[31mINGRESE CODIGO DE ASOCIADO : ");
            intCodAsociado = valor.nextInt();
            reg.writeInt(intCodAsociado); //Escribimos en el archivo

            if(intCodAsociado != 0) // Si el codigo de deporte es distinto a 0, guarda lo valores.
            {                    
                System.out.print("INGRESE EL NOMBRE : ");
                strNombre = valor.next();
                reg.writeBytes(strNombre);  //Escribimos en el archivo              

                System.out.print("INGRESE EL APELLIDO : ");
                strApellido = valor.next();
                reg.writeBytes(strApellido); //Escribimos en el archivo

                System.out.print("INGRESE LA EDAD : ");
                intEdad = valor.nextInt();
                reg.writeInt(intEdad); //Escribimos en el archivo

                System.out.print("INGRESE EL CODIGO DEL DEPORTE : ");
                intCodDeporte = valor.nextInt();
                reg.writeInt(intCodDeporte); //Escribimos en el archivo                   

            }
            else
            {
                System.out.println("\033[31mLA CARGA DE DATOS HA FINALIZADO . . .");   
            }
        }
        catch(IOException ex)
        {
            System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
        }
        finally
        {
            try
            {
                reg.close(); //Cerramos el registro.
            }
            catch(IOException e)
            {
                e.printStackTrace(); //Mostramos un mensaje de error.
            }
        }
    }
    public void LeerAsociado() throws IOException{
        Asociado[] vecAsociado = new Asociado[20];  
        
        /*AMBITO DE VARIABLE - ASOCIADO*/
        int intCodAsociado;
        String strNombre;
        String strApellido;
        int intEdad;
        int intCodDeporte;
        
        /*RUTA DE LOS ARCHIVOS*/
        String strRutaAsociado = "C:\\Users\\Mauro\\Documents\\Asociado.txt";
        
        
        /*VALIDAR LA EXISTENCIA DE LO ARCHIVOS*/
        BufferedReader brAsociado = getBuffered(strRutaAsociado);    

        String lineaAsociado =  brAsociado.readLine();
             
        DataInputStream reg = null;
        
        /*LEEMOS EL PRIMER ARCHIVO - ASOCIADO */
        try{
             reg = new DataInputStream(new FileInputStream (strRutaAsociado)); //Leemos el archivo en la direccion de memoria c:

             System.out.println(" CODIGO ASOCIADO | NOMBRE | APELLIDO | EDAD | CODIGO DEPORTE ");

             while(lineaAsociado != null)
             {
                vecAsociado[i] = new Asociado();
                intCodAsociado = reg.readInt();
                vecAsociado[i].intCodAsociado = intCodAsociado;

                strNombre = reg.readLine();
                vecAsociado[i].strNombre = strNombre;

                strApellido = reg.readLine();
                vecAsociado[i].strApellido = strApellido;

                intEdad = reg.readInt();
                vecAsociado[i].intEdad = intEdad;

                intCodDeporte = reg.readInt();
                vecAsociado[i].intCodDeporte = intCodDeporte;   

                System.out.println(vecAsociado[i].intCodAsociado + vecAsociado[i].strNombre + vecAsociado[i].strApellido  + vecAsociado[i].intEdad + vecAsociado[i].intCodDeporte );

                i++;

             }
        }
        catch(IOException ex)
        {
            System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
        }
        finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != reg ){   
                  reg.close();     
               }                  
            }catch (Exception ex){ 
               ex.printStackTrace();
            }
        }
    }
    
    public void LeerDeporte() throws IOException{
        Deporte[] vecDeporte = new Deporte[20];
        DataInputStream reg = null;
        String strRutaDeporte = "C:\\Users\\Mauro\\Documents\\Deporte.txt";
        BufferedReader brDeporte = getBuffered(strRutaDeporte);
        String lineaDeporte =  brDeporte.readLine();    
        
        /*AMBITO DE VARIABLES - DEPORTES*/
        //int intCodDeporte;
        String strDescripcion;
        int intValorCuota;
        int intCodDeporte;
        
        /*LEEMOS EL ARCHIVO - DEPORTES*/
        try{
             reg = new DataInputStream(new FileInputStream (strRutaDeporte)); //Leemos el archivo en la direccion de memoria c:            
             
             System.out.println(" CODIGO DEPORTE | DESCRIPCION | VALOR CUOTA ");
             
             while(lineaDeporte != null)
             {
                vecDeporte[i] = new Deporte();
                intCodDeporte = reg.readInt();
                vecDeporte[i].intCodDeporte = intCodDeporte;

                strDescripcion = reg.readLine();
                vecDeporte[i].strDescripcion = strDescripcion;

                intValorCuota = reg.readInt();
                vecDeporte[i].intValorCuota = intValorCuota;                     

                System.out.println(vecDeporte[i].intCodDeporte + vecDeporte[i].strDescripcion + vecDeporte[i].intValorCuota);
                i++;

             }
        }
        catch(IOException ex)
        {
            System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
        }
        finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != reg ){   
               reg.close();     
            }                  
         }catch (Exception ex){ 
            ex.printStackTrace();
         }
      }
    }

    public static BufferedReader getBuffered(String link){
        FileReader lector  = null;
        BufferedReader br = null;
        try {
             File Arch=new File(link);
            if(!Arch.exists()){
               System.out.println("No existe el archivo");
            }else{
               lector = new FileReader(link);
               br = new BufferedReader(lector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return br;
    }
}
