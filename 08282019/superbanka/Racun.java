package superbanka;

public class Racun {
	
	private static int univBrBracuna=0;
	
	private int brRacuna; //get, postavljamo u konst.
	private double stanje; //get;
	private Covek covek;
	
	public Racun(Covek covek) {
		this.covek=covek;
		this.brRacuna=univBrBracuna++;
		stanje=0;
	}	
	public int getBrRacuna() {
		return brRacuna;
	}
	public double getStanje() {
		return stanje;
	}
	public void dodajNovac(double novac) {
		if(novac>0) {
			stanje+=novac;
		}
	}
	public void oduzmiNovac(double novac) {
		if(novac>0 && stanje>=novac) {
			stanje-=novac;
		}
	}
	public static void restRacun(Racun r) {
		r.stanje=0;
	}
	public Covek getCovek() {
		return covek;
	}
	public void setCovek(Covek covek) {
		this.covek=covek;
	}
}
