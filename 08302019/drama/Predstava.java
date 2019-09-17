package drama;

import java.util.ArrayList;
import java.util.List;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private List<Zaposleni> zaposleni;

	// Constructor
	public Predstava(String naziv, Pozoriste pozoriste) {
			this.naziv = naziv;
			this.pozoriste = pozoriste;
			zaposleni = new ArrayList<>();
		}

	// Method to add an employee to performance
	public void dodajZaposleni(Zaposleni z) {
		zaposleni.add(z);
	}
	public void removeZaposleni(Zaposleni z) {
		zaposleni.remove(z);
	}
	
	// Getters
	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public int getBrojZaposlenih() {
		return zaposleni.size();
	}

	// Print
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.naziv).append(", ");
		sb.append(pozoriste.getIme()).append("\n");
		for(Zaposleni z:zaposleni) {
			sb.append(z+"\n");
		}
		return sb.toString();
	}

}
