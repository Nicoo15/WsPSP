
public class Persona {

	private TipoPersona persona;
	private String nombre;
	private String dni;
	private int telefono;
	private Direccion direccion;

	public Persona(TipoPersona persona, String nombre, String dni, int telefono, Direccion direccion) {
		super();
		this.persona = persona;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [persona=" + persona + ", nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}

}
