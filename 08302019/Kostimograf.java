package drama;

public class Kostimograf extends Zaposleni {

	public Kostimograf(String naziv) {
		super(naziv);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public char getOznaka() {
		return 'K';
	}
	@Override
	public String toString() {
		return super.toString()+" je kostimograf";
	}

}
