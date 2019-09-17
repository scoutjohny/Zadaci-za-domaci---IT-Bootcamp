package fakultet;

public class Student extends Covek{
	private String brIndeksa;
	private String fakultet;

	public Student(String ime,String prezime,String brIndeksa,String fakultet) {
		super(ime,prezime);
		this.brIndeksa=brIndeksa;
		this.fakultet=fakultet;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public String getFakultet() {
		return fakultet;
	}
	
}
