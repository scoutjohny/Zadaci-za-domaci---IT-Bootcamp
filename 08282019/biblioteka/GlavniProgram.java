package biblioteka;

public class GlavniProgram {

	public static void main(String[] args) {
		Autor a1=new Autor("Jelena","Obradovic",1988);
		
		Knjiga k1= new Knjiga("Jelenino smejanje",a1,666);
		Autor pom=k1.getAutor();
		//System.out.println(k1.getNaziv() +" "+a1.getIme()+" "+a1.getPrezime());
		System.out.println(k1.getNaziv() +" "+pom.getIme()+" "+pom.getPrezime());
		a1=new Autor("Milos","Stanojevic",1992);
		Knjiga k2= new Knjiga("Nesa majstorica",a1,333);
		pom=k2.getAutor();
		System.out.println(k1.getNaziv() +" "+a1.getIme()+" "+a1.getPrezime());
		System.out.println(k2.getNaziv() +" "+pom.getIme()+" "+pom.getPrezime());
		
	}

}
