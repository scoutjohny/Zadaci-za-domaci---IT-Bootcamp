package ordinacija;

import java.util.ArrayList;
import java.util.List;

public class Ordinacija {
	private String imeO;
	private double cena;
	private double stanje;//-5 poena ako imaju protected ili public
	List<Stomatolog> stomatolozi;
	List<Pacijent> pacijenti;//-2 za new arraylist

	public Ordinacija(String imeO, double cena) {
		this.imeO = imeO;
		this.cena = cena;
		stomatolozi = new ArrayList<>();
		pacijenti = new ArrayList<>();
		stanje = 0;//1
	}

	public String getImeO() {
		return imeO;
	}//1

	public double getCena() {
		return cena;
	}//1

	public void dodajStomatologa(Stomatolog stomatolog) {
		stomatolozi.add(stomatolog);//2
	}

	public void ukloniStomatologa(Stomatolog stomatolog) {
		stomatolozi.remove(stomatolog);//2

	}

	public void dodajPacijenta(Pacijent pacijent) {
		pacijenti.add(pacijent);//2
	}

	public void ukloniPacijenta(Pacijent pacijent) {
		pacijenti.remove(pacijent);//2
	}

	public int getBrStomatologa() {
		return stomatolozi.size();//2
	}

	public int getBrPacijenata() {
		return pacijenti.size();//2
	}

	public void naplatiUsluge() {//5 poena
		for (Pacijent p : pacijenti) {
			if (!p.oduzmiPare(cena)) {
				System.out.println(p + " ide u aps!");
			}
			else {
				stanje+=cena;
			}
		}
	}

	public boolean isplatiPlatu(double plata) {//5 poena
		if (plata * stomatolozi.size() > stanje || plata <= 0) {
			return false;
		}
		for (Stomatolog s : stomatolozi) {
			s.dodajPare(plata);
			stanje -= plata;
		}
		return true;
	}

	@Override
	public String toString() {//5 poena/ Bez string buildera 2 poena
		StringBuilder sb = new StringBuilder();
		sb.append(imeO).append(":").append(cena);
		sb.append("\n");
		sb.append("DOKTORI\n");
		for (Stomatolog s : stomatolozi) {
			sb.append(s + "\n");
		}
		sb.append("PACIJENTI\n");
		for (Pacijent p : pacijenti) {
			sb.append(p + "\n");
		}
		return sb.toString();
	}

}
