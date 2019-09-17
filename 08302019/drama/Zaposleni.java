package drama;

public abstract class Zaposleni {
	private String naziv;
	private Pozoriste pozoriste;
	public Zaposleni(String naziv, Pozoriste pozoriste) {
		super();
		this.pozoriste=pozoriste;
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public abstract char getOznaka();
	
	//Anotacija
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(naziv).append("[").append(getOznaka());
		sb.append(",").append(pozoriste.getIme()).append("]");
		return sb.toString();
	}
}
