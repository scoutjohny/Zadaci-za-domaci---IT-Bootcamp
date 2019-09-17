package ordinacija;

public abstract class Covek {
	private static int uid = 0;
	private int id;//-5 poena ako imaju protected ili public
	private String ime;
	private String jmbg;
	private double pare;

	public Covek(String ime, String jmbg) {
		this.ime = ime;
		this.jmbg = jmbg;
		pare = 0;
		id = ++uid;//3 poena
	}

	public static int getUid() {
		return uid;
	}//ne moraju da imaju

	public int getId() {
		return id;
	}

	public String getIme() {
		return ime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public double getPare() {
		return pare;
	}

	public boolean dodajPare(double novac) {//3 poena
		if (novac <= 0)
			return false;
		this.pare += novac;
		return true;
	}

	public boolean oduzmiPare(double novac) {
		if (novac > pare || novac <= 0)//3 poena
			return false;
		pare -= novac;
		return true;
	}

	@Override
	public String toString() {
		return getIme() + " [" + getId() + " : " + getJmbg() + " : " + getPare() + " ]";
	}
}
