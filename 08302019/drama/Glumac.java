package drama;

public class Glumac extends Zaposleni{

	public Glumac(String naziv,Pozoriste pozoriste) {
		super(naziv, pozoriste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getOznaka() {
		return 'G';
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
