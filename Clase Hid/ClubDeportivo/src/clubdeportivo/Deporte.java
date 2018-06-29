package clubdeportivo;

/*AMBITO IMPORT*/
import java.util.*;
import java.io.*;

public class Deporte {
        
    public int getIntCodDeporte() {
		return intCodDeporte;
	}

	public void setIntCodDeporte(int intCodDeporte) {
		this.intCodDeporte = intCodDeporte;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	
	public float getFloatValorCuota() {
		return intValorCuota;
	}

	public void setFloatValorCuota(float intValorCuota) {
		this.intValorCuota = intValorCuota;
	}
	
	private int intCodDeporte;
	private String strDescripcion;
	private float intValorCuota; 

	public Deporte() 
    {}
    
    public Deporte(int intCodDeporte, String strDescripcion, int intValorCuota)
    {
        this.intCodDeporte = intCodDeporte;
        this.strDescripcion = strDescripcion;
        this.intValorCuota = intValorCuota;
    }
}
