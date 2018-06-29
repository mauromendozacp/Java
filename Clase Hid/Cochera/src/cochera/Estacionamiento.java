package cochera;

public class Estacionamiento {
	private int piso;
	private int capacidad;
	private String[] lugar;
	private int[] hora;
	
	public int[] getHora() {
		return hora;
	}

	public void setHora(int j, int hora) {
		this.hora[j] = hora;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String[] getLugar() {
		return lugar;
	}

	public void setLugar(int j, String lugar) {
		this.lugar[j] = lugar;
	}
	
	public Estacionamiento(int piso) {
		this.piso = piso;
		this.capacidad = 0;
		this.lugar = new String[] {"libre", "libre", "libre", "libre", "libre"};
		this.hora = new int[] {0,0,0,0,0};
	}
}