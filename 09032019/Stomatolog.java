package ordinacija;

public class Stomatolog extends Covek{
	//-5 poena ako imaju protected ili public
	public Stomatolog(String ime, String jmbg){
        super(ime, jmbg);//3 poena
    }
    @Override
    public String toString() {//2 poena
        return "S_" + super.toString();
    }
}
