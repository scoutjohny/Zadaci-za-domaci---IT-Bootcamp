package drama;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		Pozoriste p1= new Pozoriste("Bosko D(B)uha");
		Zaposleni z1= new Glumac("Zlatko",p1);
		Zaposleni z2= new Reditelj("Marko",p1);
		Zaposleni z3= new Kostimograf("Miloje",p1);
		Predstava pred1=new Predstava("Ni na Javi ni u Snu", p1);
		pred1.dodajZaposleni(z1);
		pred1.dodajZaposleni(z2);
		pred1.dodajZaposleni(z3);
		System.out.println(pred1);
		pred1.removeZaposleni(z2);
		System.out.println(pred1);
		
	}

}
