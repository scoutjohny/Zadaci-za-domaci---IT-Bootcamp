package drum1;

public class Automobil {
	private String sBroj;
	private int snaga;
	private Vozac vozac;
	public Automobil(String sBroj) {
		this.sBroj = sBroj;
		vozac=null;
	}
	public int getSnaga() {
		return snaga;
	}
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}
	public void resetVozac() {
		vozac=null;
	}
	public String getsBroj() {
		return sBroj;
	}
	public String ispisi() {
		String s;
		if(vozac==null) {
			s="NEMA VOZACA";
		}else {
			s=vozac.ispisi();
		}
		return sBroj+"{"+snaga+"}"+s;
	}
	
	
}
