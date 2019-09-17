package katastar;

public class Suma extends Parcela{

	private double povrsStabla, prinosSt;
	private int periodSaz;

	public Suma(double povrsina, double povrsStabla, double prinosSt, int periodSaz) {
		super(povrsina);
		//*
		this.povrsStabla = povrsStabla;
		this.prinosSt = prinosSt;
		this.periodSaz = periodSaz;
	}

	public double getPovrsStabla() {
		return povrsStabla;
	}

	public double getPrinosSt() {
		return prinosSt;
	}

	public int getPeriodSaz() {
		return periodSaz;
	}

	@Override
	public char getOznaka() {
		return 'S';
	}
	@Override
	public double getPrinos(int godine) {
		
		return getPovrsina()/povrsStabla*prinosSt*(godine/periodSaz);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":(").append(this.povrsStabla);
		sb.append(",").append(this.prinosSt).append(",").append(this.periodSaz).append(")");
		return sb.toString();
	}



}
