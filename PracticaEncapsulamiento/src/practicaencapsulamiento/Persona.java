/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaencapsulamiento;

/**
 *
 * @author ari08
 */
public class Persona {
    public Persona() {
        this.dni = 0;
        this.nomb = null;
        this.edad = 0;
    }

    public Persona(int dni, String nomb, int edad) {
        this.dni = dni;
        this.nomb = nomb;
        this.edad = edad;
    }
    
    private int dni;
    private String nomb;
    private int edad;

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNomb() {
        return nomb;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    
    public void Saludo(){
        System.out.println("\nQue pedo q pez");
    }
    public void Mostrar(){
        System.out.println("\nNombre: " + getNomb() + "\nDNI: " + getDni() + "\nEdad: " + getEdad());
    }
}
