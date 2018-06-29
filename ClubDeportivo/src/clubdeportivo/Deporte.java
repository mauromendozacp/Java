package clubdeportivo;

/*AMBITO IMPORT*/
import java.util.*;
import java.io.*;

public class Deporte {
    
    int intCodDeporte;
    String strDescripcion;
    int intValorCuota; 
    
    public Deporte() 
    {}
    
    public Deporte(int intCodDeporte, String strDescripcion, int intValorCuota)
    {
        this.intCodDeporte = intCodDeporte;
        this.strDescripcion = strDescripcion;
        this.intValorCuota = intValorCuota;
    }
}
