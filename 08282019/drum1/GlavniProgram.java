package drum1;

public class GlavniProgram {
	public static void main(String[] args) {
		Vozac v1 = new Vozac("Zlatko Despotovic");
		Automobil a1 = new Automobil("0000001");
		a1.setVozac(v1);
		System.out.println(v1.ispisi());
		System.out.println(a1.ispisi());
		a1.resetVozac();
		System.out.println(a1.ispisi());
	}

}
