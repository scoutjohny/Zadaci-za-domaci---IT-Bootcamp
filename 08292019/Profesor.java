package fakultet;

public class Profesor extends Covek {
	private String fakultet;
	private String predmet;

	public Profesor(String ime, String prezime,String fakultet, String predmet) {
		super(ime,prezime);
		this.fakultet = fakultet;
		this.predmet = predmet;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

}
