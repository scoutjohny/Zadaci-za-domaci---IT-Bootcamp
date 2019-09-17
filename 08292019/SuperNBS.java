package superbanka;

public class SuperNBS {

	public static void main(String[] args) {
		Covek c1= new Covek();
		Racun r1= new Racun(c1);
		Racun r2= new Racun(c1);
		Banka bank= new Banka(10);
		bank.dodajRacun(r1);
		bank.dodajRacun(r2);
		System.out.println(bank.ispisi());
		bank.izbaciRacun(r1);
		System.out.println(bank.ispisi());
		
		
		
		//System.out.println(r2.getBrRacuna());
		/*Covek c1=new Covek();
		System.out.println("Ukupno: "+Covek.getUID()+"Covek c1 "+c1.getID());
		Covek c2= new Covek();
		System.out.println("Ukupno: "+Covek.getUID());*/
		}

}
