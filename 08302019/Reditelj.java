package drama;

public class Reditelj extends Zaposleni {

	public Reditelj(String naziv) {
		super(naziv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getOznaka() {
		return 'R';
	}
	@Override
	public String toString() {
		return super.toString()+" je reditelj";
	}
}
