package fakultet;

public class Student {
	private String ime;
	private String brIndeksa;
	private String fakultet;

	public Student(String brIndeksa,String fakultet) {
		this.brIndeksa=brIndeksa;
		this.fakultet=fakultet;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime=ime;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public String getFakultet() {
		return fakultet;
	}
}
