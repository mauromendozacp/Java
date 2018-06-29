package practicaencapsulamiento;

public class Camisa {
    private char talle;
    private float precio;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public float getPrecio() {
        return precio;
    }

    public char getTalle() {
        return talle;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }
    
}
