package fakultet;

public class Covek {
	private static int UnivJMBG=0;
	private int jmbg;
	private String ime;
	private String prezime;
	protected int godine;

	public Covek(String ime,String prezime) {
		this.ime = ime;
		this.prezime=prezime;
		jmbg=++UnivJMBG;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getJMBG() {
		return jmbg;
	}
	public static int getUnivJMBG() {
		return UnivJMBG;
	}
	
}
