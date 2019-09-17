package drum;

public class Automobil {
	// Automobil poseduje serijski broj
	// koji se zadaje prilikom kreiranja
	// i ne moze da se promeni. Serijski broj moze samo da se dohvati
	// Takodje poseduje marku koja se zadaje prilikom kreiranja i moze
	// samo da se dohvati
	// Pored toga poseduje i ime vlasnika 
	// koje moze da se dohvati i postavi
	// u bilo kom trenutku
	// Poseduje i jacinu motora u konjskim snaga koja je ceobrojan tip
	// jacina postavi i dohvati u bilo kom trenutku
	private String serBr,marka;// postavljamo u konstruktoru; ima samo get
	private String ime;//get/set;
	private int jacina;//get/set;
	
	public Automobil(String serBr,String marka) {
		this.serBr=serBr;
		this.marka=marka;
		ime="";
		jacina=0;
	}
	public String getSerBr() {
		return serBr;
	}
	public String getMarka() {
		return marka;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime=ime;
	}
	public int getJacina() {
		return jacina;
	}
	public void setJacina(int jacina) {
		this.jacina=jacina;
	}
}
