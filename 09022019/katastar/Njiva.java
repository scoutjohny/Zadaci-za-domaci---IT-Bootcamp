package katastar;

public class Njiva extends Parcela{
	private double ppKvKm;
	

	public Njiva(double povrsina, double ppKvKm) {
		super(povrsina);
		this.ppKvKm = ppKvKm;
	}

	@Override
	public double getPrinos(int godine) {
			return this.getPovrsina()*this.ppKvKm*godine;
		
	}
	

	public void setPpKvKm(double ppKvKm) {
		this.ppKvKm = ppKvKm;
	}
	

	public double getPpKvKm() {
		return ppKvKm;
	}

	@Override
	public char getOznaka() {
		return 'N';
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(super.toString()).append(":").append(this.ppKvKm);
		return sb.toString();
	}


}
