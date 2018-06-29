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
    
    //Rutas
    String strRutaDeporte = "C:\\Users\\Public\\Deporte.txt";
    String strRutaAsociado = "C:\\Users\\Public\\Asociado.txt";
	
    public void CrearDeporte(){
        /*----VARIABLES----*/
    	Deporte pDeporte = new Deporte();
        
        Scanner valor = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            if(BuscarArchivo(strRutaDeporte)){
            	fichero = new FileWriter(strRutaDeporte, true);
            }
            else{
            	fichero = new FileWriter(strRutaDeporte);
            }
            pw = new PrintWriter(fichero); //Guardamos el archivo en la direccion de memoria
            
            System.out.print("\nINGRESE CODIGO DE DEPORTE : ");
            pDeporte.setIntCodDeporte(valor.nextInt());
            
            if(pDeporte.getIntCodDeporte() != 0) // Si el codigo de deporte es distinto a 0, guarda lo valores.
            {             
            	 //Escribimos en el archivo
                System.out.print("INGRESE DESCRIPCION : ");
                pDeporte.setStrDescripcion(valor2.nextLine());
                
                System.out.print("INGRESE EL VALOR CUOTA : ");
                pDeporte.setFloatValorCuota(valor.nextFloat());
                
                pw.println("-Deporte-");
                pw.println(pDeporte.getIntCodDeporte());
                pw.println(pDeporte.getStrDescripcion());
                pw.println(pDeporte.getFloatValorCuota());
                System.out.println("\nDEPORTE AGREGADO CORRECTAMENTE!");
            }
            else // Si el codigo de deporte es 0 se cierra el guardado de datos.
            {
            	System.out.println("\nERROR, NO SE PUEDE AGREGAR EL CODIGO!");
            }
        }
        catch(IOException ex)
        {
            System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
        }
        finally
        {
            try //Cerramos el regristro.
            {
            	if (null != fichero)
                    fichero.close();
                 } catch (Exception e2) {
                    e2.printStackTrace();
             }
        }
    }
    public void CrearAsociado(){
        /*----VARIABLES----*/
        Asociado pAsociado = new Asociado();
        
        Scanner valor = new Scanner(System.in);
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
        	if(BuscarArchivo(strRutaAsociado)){
            	fichero = new FileWriter(strRutaAsociado, true);
            }
            else{
            	fichero = new FileWriter(strRutaAsociado);
            }
        	//Guardamos el archivo en la direccion de memoria c:
            pw = new PrintWriter(fichero);
            
            System.out.print("\nINGRESE CODIGO DE ASOCIADO : ");
            pAsociado.setIntCodAsociado(valor.nextInt());

            if(pAsociado.getIntCodAsociado() != 0) // Si el codigo de deporte es distinto a 0, guarda lo valores.
            {
            	//Escribimos en el archivo
                System.out.print("INGRESE EL NOMBRE : ");
                pAsociado.setStrNombre(valor.next());        

                System.out.print("INGRESE EL APELLIDO : ");
                pAsociado.setStrApellido(valor.next());

                System.out.print("INGRESE LA EDAD : ");
                pAsociado.setIntEdad(valor.nextInt());

                System.out.print("INGRESE EL CODIGO DEL DEPORTE : ");
                pAsociado.setIntCodDeporte(valor.nextInt());                
                
                pw.println("-Asociado-");
            	pw.println(pAsociado.getIntCodAsociado());
                pw.println(pAsociado.getStrNombre());
                pw.println(pAsociado.getStrApellido());
                pw.println(pAsociado.getIntEdad());
                pw.println(pAsociado.getIntCodDeporte()); 
                System.out.println("\nASOCIADO AGREGADO CORRECTAMENTE!");
            }
            else // Si el codigo de deporte es 0 se cierra el guardado de datos.
            {
            	System.out.println("\nERROR, NO SE PUEDE AGREGAR EL CODIGO!");
            }
        }
        catch(IOException ex)
        {
            System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
        }
        finally
        {
        	try //Cerramos el regristro.
            {
            	if (null != fichero)
                    fichero.close();
                 } catch (Exception e2) {
                    e2.printStackTrace();
             }
        }
    }
    public void LeerAsociado() throws IOException{
        Asociado pAsociado;  
        
        File archivo = null;
    	FileReader fr  = null;
        BufferedReader br = null;
    	
        if(BuscarArchivo(strRutaAsociado)){
        	/*LEEMOS EL PRIMER ARCHIVO - ASOCIADO */
            try{
            	/*LEEMOS EL ARCHIVO - ASOCIADO*/
            	archivo = new File (strRutaAsociado);
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);

                 System.out.println(" CODIGO ASOCIADO | NOMBRE | APELLIDO | EDAD | CODIGO DEPORTE ");

                 while((br.readLine()) != null)
                 {
                    pAsociado = new Asociado();
                    
                    pAsociado.setIntCodAsociado(Integer.parseInt(br.readLine()));
                    pAsociado.setStrNombre(br.readLine());
                    pAsociado.setStrApellido(br.readLine());
                    pAsociado.setIntEdad(Integer.parseInt(br.readLine()));
                    pAsociado.setIntCodDeporte(Integer.parseInt(br.readLine()));
                    
                    System.out.println(pAsociado.getIntCodAsociado() + " - " + pAsociado.getStrNombre() + " - " + pAsociado.getStrApellido() + " - "  + pAsociado.getIntEdad() + " - " + pAsociado.getIntCodDeporte());
                 }
            }
            catch(IOException ex)
            {
                System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
            }
            finally
            {
                 // En el finally cerramos el fichero, para asegurarnos
                 // que se cierra tanto si todo va bien como si salta 
                 // una excepcion.
            	try{                    
                    if( null != fr ){   
                       fr.close();     
                    }                  
                 }catch (Exception e){ 
                    e.printStackTrace();
                 }
            }
        }
        else{
        	System.out.println("No existe el archivo");
        }
    }
    
    public void LeerDeporte() throws IOException{
    	Deporte pDeporte;
        
    	File archivo = null;
    	FileReader fr  = null;
        BufferedReader br = null;
        
        if(BuscarArchivo(strRutaDeporte)){
            try{
                /*LEEMOS EL ARCHIVO - DEPORTES*/
            	archivo = new File (strRutaDeporte);
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
            	
            	//Leemos el archivo en la direccion de memoria            
                 
                System.out.println(" CODIGO DEPORTE | DESCRIPCION | VALOR CUOTA ");

                while((br.readLine()) != null)
                {
                   pDeporte = new Deporte();

                   pDeporte.setIntCodDeporte(Integer.parseInt(br.readLine()));
                   pDeporte.setStrDescripcion(br.readLine());
                   pDeporte.setFloatValorCuota(Float.parseFloat(br.readLine()));

                   System.out.println(pDeporte.getIntCodDeporte() + " - " + pDeporte.getStrDescripcion() + " - "  + pDeporte.getFloatValorCuota());
                }
            }
            catch(IOException ex)
            {
                System.err.println("Algo salio mal..." + ex.getMessage()); //Mostramos un mensaje de error.
            }
            finally
            {
	             // En el finally cerramos el fichero, para asegurarnos
	             // que se cierra tanto si todo va bien como si salta 
	             // una excepcion.
            	try{                    
                    if( null != fr ){   
                       fr.close();     
                    }                  
                 }catch (Exception e2){ 
                    e2.printStackTrace();
                 }
            }
        }
        else{
        	System.out.println("No existe el archivo");
        }
    }

    public static Boolean BuscarArchivo(String link){
    	File Arch = null;
        try {
             Arch = new File(link);
            if(!Arch.exists()){
               return false;
            }else{
               return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
