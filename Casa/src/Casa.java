import java.util.ArrayList;

public class Casa {

	private Direccion direccion;
	private Persona dueno;
	private ArrayList<Persona> inquilino;
	private ArrayList<Habitacion> habitacion;
	private double metros2;

	
	public double metros2() {
		metros2 = 0;
		for (int i = 0; i < this.habitacion.size(); i++) {
			metros2 += this.habitacion.get(i).getMetros();
		}

		return metros2;
	}
	public Casa(Direccion direccion, Persona dueno, ArrayList<Habitacion> habitacion, ArrayList<Persona> inquilino) {
		super();
		this.direccion = direccion;
		this.habitacion = habitacion;
		this.dueno = dueno;
		this.inquilino = inquilino;
	}
	@Override
	public String toString() {
        return "Casa = " + direccion.toString() + "Habitaciones = " + habitacion.toString() + "Propietario = "
                + dueno.toString() + " Inquilino = " + inquilino.toString() + " Metros cuadrados = " + metros2;
    }

}