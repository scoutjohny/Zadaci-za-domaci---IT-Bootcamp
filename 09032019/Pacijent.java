package ordinacija;

public class Pacijent extends Covek{
	//-5 poena ako imaju protected ili public
	public Pacijent(String ime, String jmbg){
        super(ime, jmbg);
    }//3 poena
    @Override
    public String toString() {//2 poena
        return "P_" + super.toString();
    }
}
