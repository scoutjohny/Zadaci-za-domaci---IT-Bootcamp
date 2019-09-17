package drama;

public abstract class Zaposleni {
	private String naziv;

	public Zaposleni(String naziv) {
		super();
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public abstract char getOznaka();
	
	//Anotacija
	@Override
	public String toString() {
		return naziv+"["+getOznaka()+",]";
	}
}
