package drum;

public class GlavniP {

	public static void main(String[] args) {
		Automobil a=new Automobil("21212","Audi");
		Automobil a2= new Automobil("0101", "Hjundai");
		a.setJacina(250);
		a2.setJacina(55);
		System.out.println(a.getMarka()+" "+a.getJacina());
		System.out.println(a2.getMarka()+" "+a2.getJacina());
	}

}
