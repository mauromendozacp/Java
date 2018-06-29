package clubdeportivo;

/*AMBITO IMPORT*/
import java.util.*;
import java.io.*;


public class Asociado {
    
    int intCodAsociado;
    String strApellido;
    String strNombre;
    int intEdad;
    int intCodDeporte;
    
    public Asociado() 
    {}
    
    public Asociado(int intCodAsociado,String strApellido, String strNombre, int intEdad, int intCodDeporte)
    {
        this.intCodAsociado = intCodAsociado;
        this.strApellido = strApellido;
        this.strNombre = strNombre;
        this.intEdad = intEdad;
        this.intCodDeporte = intCodDeporte;        
    }
}