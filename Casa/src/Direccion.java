
public class Direccion {

	private String via;
	private String calle;
	private int cp;
	private int num;

	public Direccion(String via, String calle, int cp, int num) {
		super();
		this.via = via;
		this.calle = calle;
		this.cp = cp;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Direccion [via=" + via + ", calle=" + calle + ", cp=" + cp + ", num=" + num + "]";
	}

}