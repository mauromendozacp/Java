/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maritopractice;
public class Cochera {

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getHe() {
        return he;
    }

    public void setHe(int he) {
        this.he = he;
    }

    public int getMe() {
        return me;
    }

    public void setMe(int me) {
        this.me = me;
    }

    public Cochera(String patente, int he, int me) {
        this.patente = patente;
        this.he = he;
        this.me = me;
    }
    
    public int DarCalc(int ha, int ma){
        
    }
    
    private String patente;
    private int he;
    private int me;
    
    
}
