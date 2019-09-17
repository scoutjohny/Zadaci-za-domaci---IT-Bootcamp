package drama;

public class Kostimograf extends Zaposleni {

	public Kostimograf(String naziv,Pozoriste pozoriste) {
		super(naziv, pozoriste);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public char getOznaka() {
		return 'K';
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
