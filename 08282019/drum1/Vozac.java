package drum1;

public class Vozac {
	private  static int UBroj_Vozacke=0;
	private String naziv;
	private int brojVozacke;
	public Vozac(String naziv) {
		this.naziv = naziv;
		brojVozacke=++UBroj_Vozacke;
	}
	public static int getUBroj_Vozacke() {
		return UBroj_Vozacke;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getBrojVozacke() {
		return brojVozacke;
	}
	public String ispisi() {
		return naziv+"{"+brojVozacke+"}";
	}
	
	

}
