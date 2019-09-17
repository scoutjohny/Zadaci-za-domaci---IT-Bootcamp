package superbanka;

public class SuperNBS {

	public static void main(String[] args) {
		Covek c1= new Covek();
		Racun r1= new Racun(c1);
		Racun r2= new Racun(c1);
		Banka bank= new Banka();
		bank.racuni.add(r1);
		bank.racuni.add(r2);
		//Racun r2= new Racun();
		r1.dodajNovac(5000);
		System.out.println(r1.getBrRacuna() + "|"+r1.getStanje());
		Racun.restRacun(r1);
		System.out.println(r1.getBrRacuna() + "|"+r1.getStanje());
		//System.out.println(r2.getBrRacuna());
		/*Covek c1=new Covek();
		System.out.println("Ukupno: "+Covek.getUID()+"Covek c1 "+c1.getID());
		Covek c2= new Covek();
		System.out.println("Ukupno: "+Covek.getUID());*/
		}

}
