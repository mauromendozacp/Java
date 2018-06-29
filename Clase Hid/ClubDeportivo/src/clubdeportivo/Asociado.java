package clubdeportivo;

/*AMBITO IMPORT*/
import java.util.*;
import java.io.*;


public class Asociado {
	
    public int getIntCodAsociado() {
		return intCodAsociado;
	}

	public void setIntCodAsociado(int intCodAsociado) {
		this.intCodAsociado = intCodAsociado;
	}

	public String getStrApellido() {
		return strApellido;
	}

	public void setStrApellido(String strApellido) {
		this.strApellido = strApellido;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public int getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(int intEdad) {
		this.intEdad = intEdad;
	}

	public int getIntCodDeporte() {
		return intCodDeporte;
	}

	public void setIntCodDeporte(int intCodDeporte) {
		this.intCodDeporte = intCodDeporte;
	}
	
    private int intCodAsociado;
    private String strApellido;
    private String strNombre;
    private int intEdad;
    private int intCodDeporte;
    
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