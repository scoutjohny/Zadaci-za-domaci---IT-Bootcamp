package fakultet;

public class GlavniProgram {

	public static void main(String[] args) {
		Covek c1= new Covek("Aleksandra", "Gavrilovic");
		Profesor p1= new Profesor("Zlatko","Despotovic","FPU","Zidno slikarstvo");
		Student s1= new Student("Marko", "Drobac","007/2019", "ITBootcamp");
		System.out.println(c1.getIme()+" "+c1.getPrezime());
		System.out.println(p1.getIme()+" "+p1.getPrezime());
		System.out.println(s1.getIme()+" "+s1.getPrezime());
	}

}
