package drama;

public class Reditelj extends Zaposleni {

	public Reditelj(String naziv,Pozoriste pozoriste) {
		super(naziv, pozoriste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getOznaka() {
		return 'R';
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
