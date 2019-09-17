package drama;

public class Pozoriste {
	private static int UID = 0;
	private int id;
	private String ime;

	// Constructor
	public Pozoriste(String name) {
			this.ime = name;
			this.id = ++UID;
		}

	// Getters for ID and name
	public int getId() {
		return id;
	}

	public String getIme() {
		return ime;
	}

	// Print in form "name[id]"
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getIme()).append("[").append(this.getId()).append("]");
		return sb.toString();
	}

}
