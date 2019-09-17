package superbanka;

public class Covek {
	private static int UID=0;

	private int id;
	private String ime;
	public Covek() {
		id=++UID;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getID() {
		return id;
	}
	public static int getUID() {
		return UID;
	}
}
