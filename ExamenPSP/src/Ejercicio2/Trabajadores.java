package Ejercicio2;

public class Trabajadores {
	private String nombre;
	private String puesto;
	private String sueldo;
	
	public abstract void trabajador(trabajador t);
	public String getNombre() {
		return nombre;
	@Override
	public String toString() {
		return "Trabajadores [nombre=" + nombre + ", puesto=" + puesto + ", sueldo=" + sueldo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
