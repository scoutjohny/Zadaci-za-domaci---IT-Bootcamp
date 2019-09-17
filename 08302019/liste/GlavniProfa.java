package liste;

public class GlavniProfa {
	public static void main(String[] args) {
		Profesor p= new Profesor();
		p.addPredmet("Automatika");
		p.addPredmet("Kineski");
		p.addPredmet("Ruski");
		p.addPredmet("Likovno");
		System.out.println("Profa predaje "+ p.countPredmete()+" predmeta!");
		System.out.println(p.hasPredmet("Likovno"));
		System.out.println(p.ispis());
		p.izbaciPredmet("Likovno");
		System.out.println("Profa predaje "+ p.countPredmete()+" predmeta!");
		System.out.println(p.ispis());

	}
}
