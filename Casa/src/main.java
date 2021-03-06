import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		Direccion direccion = new Direccion("Calle", "Mayor", 28942, 4);
		Direccion direcciondueno = new Direccion("Calle", "CR7", 28670, 12);

		Persona dueno = new Persona(TipoPersona.DUENO, "Pepe", "49151224A", 630582145, direcciondueno);

		ArrayList<Persona> inquilino = new ArrayList<Persona>();

		Persona inquilino1 = new Persona(TipoPersona.INQUILINO, "Juan", "09548156Y", 69854125, direccion);
		Persona inquilino2 = new Persona(TipoPersona.INQUILINO, "Marta", "44785698L", 654123987, direccion);

		ArrayList<Habitacion> habitacion = new ArrayList<Habitacion>();
		Habitacion salon = new Habitacion(TipoHabitacion.SALON, 38.5);	
		Habitacion bano = new Habitacion(TipoHabitacion.BANO, 9.75);
		Habitacion cuartoprincipal = new Habitacion(TipoHabitacion.HABITACION, 22.5);
		Habitacion cuartoinvitados = new Habitacion(TipoHabitacion.HABITACION, 15);
		Habitacion banoinvitados = new Habitacion(TipoHabitacion.BANO, 8);
		Habitacion comedor = new Habitacion(TipoHabitacion.COMEDOR, 44.80);
		Habitacion terraza = new Habitacion(TipoHabitacion.TERRAZA, 20);

		habitacion.add(salon);
		habitacion.add(bano);
		habitacion.add(cuartoprincipal);
		habitacion.add(cuartoinvitados);
		habitacion.add(banoinvitados);
		habitacion.add(comedor);
		habitacion.add(terraza);
		inquilino.add(inquilino1);
		inquilino.add(inquilino2);

		Casa pinipon = new Casa(direccion, dueno, habitacion, inquilino);
		System.out.println(pinipon.metros2()+" metros2");
		System.out.println(pinipon.toString());

	}
	
}
