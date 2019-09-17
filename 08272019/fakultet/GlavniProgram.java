package fakultet;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s=new Student("0007/2019","ITBootcamp");
		s.setIme("Jelena Obradovic");
		System.out.println(s.getIme()+" "+s.getBrIndeksa()+" "+s.getFakultet());
		Student s2= new Student("0008/2019","ETF");
		s2.setIme("Nikola Djordjevic");
		System.out.println(s2.getIme()+" "+s2.getBrIndeksa()+" "+s2.getFakultet());
		
	}

}
