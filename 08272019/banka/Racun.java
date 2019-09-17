package banka;

public class Racun {
	//napisati klasu Racun koja ima 2 polja.
    // Prvo polje 'brRacuna' tipa String predstavlja broj racuna.
	// brRacuna moze da se dohvati, ali ne i postavi
    // Drugo polje 'stanje' tipa double 
	// predstavlja stanje na racunu
    // Stanje ima pocetnu vrednost 0 i moze da se dohvati
    // Napisati  metode za dodavanje i uzimanje
    // novca za drugo polje
	private String brRacuna; //get, postavljamo u konst.
	private double stanje; //get;
	public Racun(String brRacuna) {
		this.brRacuna=brRacuna;
		stanje=0;
	}
	public String getBrRacuna() {
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
}
