package biblioteka;

public class Autor {
	//Autor poseduje ime, prezime, godinu rodjenja, kao i
	//jedinstveni AUTOMATSKI dodeljen identifikacioni broj
	//Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
	//i ne mogu da se promene.
	
	
	//Knjiga poseduje naziv, AUTORA(TIPA Autor),
	// broj strana i godinu izdanja.
	// Sva polja mogu da se dohvate,
	// a godina izdanja moze i da se postavi
	private static int UID=0;
	private String ime,prezime;
	private int godRodj;
	private int id;
	public Autor(String ime, String prezime, int godRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
		id=++UID;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodRodj() {
		return godRodj;
	}
	public int getId() {
		return id;
	}
	public static int getUID() {
		return UID;
	}
	
	
	
}
