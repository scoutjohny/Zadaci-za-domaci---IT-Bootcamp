package lunapark;

public class GlavniProgram {
/*
 * Voznja poseduje naziv(g/s), cenu(g/s) i niz ljudi koji sede u njoj
 * Ljudi mogu da se dodaju ili uklone iz sa voznje. Kreira se sa zadatim
 * brojem sedista. Voznja moze da se naplati.
 * 
 * Ringispil je voznja koja poseduje 5 sedista za ljude.
 * Cena ringispila je 200din
 * 
 * 
 * 
 * Covek poseduje naziv i pare(d,o/get).
 * Naziv se postavlja prilikom kreiranja coveka i moze da se dohvati.
 * Pare mogu da se dodaju i oduzmu.
 */
	public static void main(String[] args) {
		Covek c= new Covek("Pera");
		Covek c2=new Covek("Perina");
		
		Ringispil r1= new Ringispil("Kamikaza!");
		r1.dodajCoveka(c);
		r1.dodajCoveka(c2);
		c.dodajNovac(1500);
		r1.naplati();
		System.out.println(c.getPare());
		System.out.println(c2.getPare());
	}
}
