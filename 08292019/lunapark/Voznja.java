package lunapark;

public class Voznja {
	private String naziv;
	private int cena;
	private Covek[] ljudi;
	private int br;

	public Voznja(String naziv, int cena, int broj) {
		super();
		this.naziv = naziv;
		this.cena = cena;
		ljudi = new Covek[broj];
		br = 0;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public boolean dodajCoveka(Covek r) {
		if (br == ljudi.length) {
			return false;
		}
		ljudi[br] = r;
		br++;
		return true;
	}

	public boolean izbaciCoveka(Covek r) {
		int pos = -1;
		for (int i = 0; i < ljudi.length; i++) {
			if (ljudi[i] == r) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			return false;
		}
		ljudi[pos] = null;
		for (int i = pos; i < br - 1; i++) {
			ljudi[i] = ljudi[i + 1];
		}
		br--;
		ljudi[br] = null;
		return true;
	}
	public void naplati() {
		for(int i=0;i<br;i++) {
			ljudi[i].oduzmiNovac(cena);
		}
	}

}
