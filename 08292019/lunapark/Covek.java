package lunapark;

public class Covek {
	private int pare;
	private String ime;
	public Covek(String ime) {
		
		pare=0;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public double getPare() {
		return pare;
	}
	public void dodajNovac(double novac) {
		if(novac>0) {
			pare+=novac;
		}
	}
	public void oduzmiNovac(double novac) {
		if(novac>0 && pare>=novac) {
			pare-=novac;
		}
	}
}
