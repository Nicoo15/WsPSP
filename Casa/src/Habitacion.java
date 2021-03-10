
public class Habitacion {

	private TipoHabitacion habitacion;
	private double metros2;
	
	public Habitacion(TipoHabitacion habitacion, double metros2) {
		super();
		this.habitacion = habitacion;
		this.metros2 = metros2;
	}

	@Override
	public String toString() {
		return "Habitacion [habitacion=" + habitacion + ", metros2=" + metros2 + "]";
	}

	public double getMetros() {
		return metros2;
	}

}
	
