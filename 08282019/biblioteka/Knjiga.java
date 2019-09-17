package biblioteka;

public class Knjiga {
	//Knjiga poseduje naziv, AUTORA(TIPA Autor),
		// broj strana i godinu izdanja.
		// Sva polja mogu da se dohvate,
		// a godina izdanja moze i da se postavi
	private String naziv;
	private Autor a;
	private int brStrana,godIzdanja;
	
	
	public Knjiga(String naziv,Autor a,int brStrana) {
		this.naziv=naziv;
		this.a=a;
		this.brStrana=brStrana;
	}
	public String getNaziv() {
		return naziv;
	}
	public Autor getAutor() {
		return a;
	}
	public int getBrStrana() {
		return brStrana;
	}
	public int getGodIzdanja() {
		return godIzdanja;
	}
	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja=godIzdanja;
	}
}
