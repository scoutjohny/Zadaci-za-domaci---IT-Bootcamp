package banka;

public class NBS {

	public static void main(String[] args) {
		Racun r1=new Racun("0001");
		System.out.println(r1.getBrRacuna() + " "+r1.getStanje());
		r1.dodajNovac(150);
		r1.dodajNovac(-50);
		System.out.println(r1.getBrRacuna() + " "+r1.getStanje());
		r1.oduzmiNovac(50);
		r1.oduzmiNovac(-50);
		System.out.println(r1.getBrRacuna() + " "+r1.getStanje());
		// 0001 100
		Racun r2=r1;
		r2.dodajNovac(150);
		System.out.println(r1.getBrRacuna() + " "+r1.getStanje());
		//r1=new Racun("00023");
	}

}
