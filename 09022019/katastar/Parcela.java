package katastar;

public abstract class Parcela {

	private static int UID = 0;
	private int id;
	private double povrsina;

	public Parcela(double povrsina) {
		this.povrsina = povrsina;
		id = ++UID;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public static int getUID() {
		return UID;
	}

	public int getID() {
		return id;
	}
	public abstract double getPrinos(int godine);

	public abstract char getOznaka();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getOznaka()).append("-").append(id).append("[").append(povrsina).append("]");
		return sb.toString();
	}

}
